package model;

/**
 * Interface que define as operações aritméticas básicas da calculadora.
 */
public interface CalculadoraModelInterface {

    /**
     * Realiza a soma de dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A soma de a e b.
     */
    double somar(double a, double b);

    /**
     * Realiza a subtração de dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A subtração de a e b.
     */
    double subtrair(double a, double b);

    /**
     * Realiza a multiplicação de dois números.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A multiplicação de a e b.
     */
    double multiplicar(double a, double b);

    /**
     * Realiza a divisão de dois números.
     *
     * @param a O numerador.
     * @param b O denominador.
     * @return A divisão de a por b.
     * @throws IllegalArgumentException Se o denominador for zero.
     */
    double dividir(double a, double b) throws IllegalArgumentException;
}
