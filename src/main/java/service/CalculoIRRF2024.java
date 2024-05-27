package service;

import model.Trabalhador;

public class CalculoIRRF2024 implements CalculoIRRFStrategy {
    public double calcular(Trabalhador trabalhador) {
        double salarioBruto = trabalhador.getSalarioBruto();
        double descontoINSS = trabalhador.getDescontoINSS();
        int numeroDependentes = trabalhador.getDependentes();
        double totalDescontosIRRF = trabalhador.getTotalDescontosIRRF();

        double baseCalculo = salarioBruto - descontoINSS - (numeroDependentes * 189.59);
        double descontoIRRF = 0.0;

        if (baseCalculo <= 1903.98) {
            descontoIRRF = 0.0;
        } else if (baseCalculo <= 2826.65) {
            descontoIRRF = baseCalculo * 0.075 - 142.80;
        } else if (baseCalculo <= 3751.05) {
            descontoIRRF = baseCalculo * 0.15 - 354.80;
        } else if (baseCalculo <= 4664.68) {
            descontoIRRF = baseCalculo * 0.225 - 636.13;
        } else {
            descontoIRRF = baseCalculo * 0.275 - 869.36;
        }

        return descontoIRRF - totalDescontosIRRF;
    }
}
