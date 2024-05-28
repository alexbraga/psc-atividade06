package dao;

import model.Trabalhador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrabalhadorDAO {
    private static final String FILE_NAME = "trabalhadores.txt";

    public List<Trabalhador> carregarTodos() {
        List<Trabalhador> trabalhadores = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(", ");

                if (dados.length == 8) {
                    Trabalhador trabalhador = new Trabalhador(
                            dados[0].split(": ")[1],
                            Double.parseDouble(dados[1].split(": ")[1].replace("R$", "")),
                            Double.parseDouble(dados[2].split(": ")[1].replace("R$", "")),
                            Integer.parseInt(dados[3].split(": ")[1]),
                            Double.parseDouble(dados[4].split(": ")[1].replace("R$", "")),
                            dados[5].split(": ")[1],
                            dados[6].split(": ")[1]
                    );

                    trabalhador.setEndereco(dados[7].split(": ")[1]);
                    trabalhadores.add(trabalhador);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar dados: " + e.getMessage());
        }

        return trabalhadores;
    }

    public void salvarTodos(List<Trabalhador> trabalhadores) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, false))) {
            for (Trabalhador trabalhador : trabalhadores) {
                writer.write(String.format("NOME: %s, SALÁRIO BRUTO: R$%.2f, DESCONTO INSS: R$%.2f, NÚMERO DE DEPENDENTES: %d, TOTAL DE DESCONTOS IRRF: R$%.2f, CPF: %s, CEP: %s, ENDEREÇO: %s",
                        trabalhador.getNome(),
                        trabalhador.getSalarioBruto(),
                        trabalhador.getDescontoINSS(),
                        trabalhador.getDependentes(),
                        trabalhador.getTotalDescontosIRRF(),
                        trabalhador.getCpf(),
                        trabalhador.getCep(),
                        trabalhador.getEndereco()
                ));

                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    public void inicializarArquivo() {
        File arquivo = new File(FILE_NAME);
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo '" + FILE_NAME + "' criado.");
            } else {
                System.out.println("Arquivo '" + FILE_NAME + "' já existe.");
            }

            System.out.println("Caminho do arquivo: " + arquivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Erro ao inicializar arquivo: " + e.getMessage());
        }
    }
}
