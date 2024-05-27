package service;

public interface CalculadoraIRRFStrategy {
    double calcular(double salarioBruto, double descontoINSS, int numeroDependentes, double totalDescontosIRRF);
}
