package model;

public class CalculadoraModelImpl implements CalculadoraModelInterface {

// métodos implementaodos por causa da interface(Contrato)
    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {

        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitido: ");
        }
        return a / b;
    }
}
