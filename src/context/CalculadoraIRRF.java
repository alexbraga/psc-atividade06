package context;

import model.Trabalhador;
import service.CalculoIRRFStrategy;

public class CalculadoraIRRF {
    private CalculoIRRFStrategy strategy;

    public CalculadoraIRRF(CalculoIRRFStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CalculoIRRFStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcularIRRF(Trabalhador trabalhador) {
        return strategy.calcular(trabalhador);
    }
}
