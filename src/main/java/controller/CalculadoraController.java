package controller;

import model.CalculadoraModelInterface;
import view.CalculadoraView;

/**
 * Classe que controla a interação entre o Model e a View.
 * Implementa a lógica principal da calculadora.
 */
public class CalculadoraController {

    private CalculadoraModelInterface model;
    private CalculadoraView view;

    /**
     * Construtor da classe CalculadoraController.
     *
     * @param model O modelo da calculadora.
     * @param view A interface de usuário da calculadora.
     */
    public CalculadoraController(CalculadoraModelInterface model, CalculadoraView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Inicia a execução da calculadora.
     * Recebe os dados do usuário, realiza o cálculo e exibe o resultado.
     */
    public void iniciar() {
        char opcao = 's';
        do {
            double num1 = view.receberNumero("Digite o primeiro numero: ");
            double num2 = view.receberNumero("Digite o segundo número: ");
            char operacao = view.receberOperacao();

            double resultado = 0;

            try {
                switch (operacao) {
                    case '+':
                        resultado = model.somar(num1, num2);
                        break;
                    case '-':
                        resultado = model.subtrair(num1, num2);
                        break;
                    case '*':
                        resultado = model.multiplicar(num1, num2);
                        break;
                    case '/':
                        resultado = model.dividir(num1, num2);
                        break;
                    default:
                        view.exibirMensagemDeErro("Operação inválida. Digite o sinal correspondente");
                        continue;
                }
                view.exibirResultado(resultado);
            } catch (IllegalArgumentException e) {
                view.exibirMensagemDeErro(e.getMessage());
            }

            opcao = view.receberOpcao();
        } while (opcao == 's');

        view.fecharScanner();
    }
}