package io.github.eziocdl;

import controller.CalculadoraController;
import model.CalculadoraModelImpl;
import view.CalculadoraView;

/**
 * Classe principal que inicia a execução da calculadora.
 */
public class Main {

    /**
     * Método principal que cria as instâncias do Model, View e Controller
     * e inicia a execução da calculadora.
     *
     * @param args Os argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        CalculadoraModelImpl model = new CalculadoraModelImpl();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(model, view);
        controller.iniciar();
    }
}