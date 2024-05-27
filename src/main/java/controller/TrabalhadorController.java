package controller;

import context.CalculadoraIRRF;
import model.Endereco;
import model.Trabalhador;
import repository.TrabalhadorRepository;
import service.CalculoIRRF2024;
import service.ConsultaCEP;
import service.ValidadorCPF;

import java.net.URISyntaxException;

public class TrabalhadorController {
    private final TrabalhadorRepository TRABALHADOR_REPOSITORY;

    public TrabalhadorController() {
        TRABALHADOR_REPOSITORY = TrabalhadorRepository.getInstance();
    }

    public void processarTrabalhador(Trabalhador trabalhador) throws URISyntaxException {
        if (!ValidadorCPF.validarCPF(trabalhador.getCpf())) {
            throw new IllegalArgumentException("CPF inválido");
        }

        Endereco endereco = ConsultaCEP.buscar(trabalhador.getCep());
        trabalhador.setEndereco(endereco.toString());
        System.out.println("Endereço para o CEP " + trabalhador.getCep() + ": " + endereco);

        CalculadoraIRRF calculadoraIRRF = new CalculadoraIRRF(new CalculoIRRF2024());
        double irrf = calculadoraIRRF.calcularIRRF(trabalhador);
        double salarioLiquido = trabalhador.getSalarioBruto() - irrf;

        System.out.println("Salário líquido: R$" + salarioLiquido);

        TRABALHADOR_REPOSITORY.adicionarOuAtualizar(trabalhador);
    }
}
