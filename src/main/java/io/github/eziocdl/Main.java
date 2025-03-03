package io.github.eziocdl;


import controller.CalculadoraController;
import model.CalculadoraModelImpl;
import view.CalculadoraView;

public class Main {
    public static void main(String[] args) {


        // criando as instancias das classes para chamar os métodos que estão encapsulados
        CalculadoraModelImpl model = new CalculadoraModelImpl();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(model, view);


        // chamando o método
        controller.iniciar();

    }
}