package controller;

import model.CalculadoraModelInterface;
import view.CalculadoraView;

import java.util.Objects;

public class CalculadoraController {

    private CalculadoraModelInterface model;
    private CalculadoraView view;

    public CalculadoraController(CalculadoraModelInterface model, CalculadoraView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        char opcao = 's'; // Inicializa opcao como char
        do {
            double num1 = view.receberNumero("Digite o primeiro numero: ");
            char operacao = view.receberOperacao();
            double num2 = view.receberNumero("Digite o segundo número: ");


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

        view.fecharScanner(); // Remove o ponto e vírgula extra
    }




    }


