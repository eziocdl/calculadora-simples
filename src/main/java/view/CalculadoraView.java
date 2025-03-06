package view;

import java.util.Scanner;

/**
 * Classe que representa a interface de usuário da calculadora.
 * Realiza a interação com o usuário através da linha de comando.
 */
public class CalculadoraView {

    private Scanner scanner;

    /**
     * Construtor da classe CalculadoraView. Inicializa o Scanner.
     */
    public CalculadoraView() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Recebe um número do usuário.
     *
     * @param mensagem A mensagem a ser exibida para o usuário.
     * @return O número digitado pelo usuário.
     */
    public double receberNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    /**
     * Recebe a operação desejada do usuário.
     *
     * @return A operação digitada pelo usuário (+, -, *, /).
     */
    public char receberOperacao() {
        System.out.print("Digite a operação (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    /**
     * Exibe o resultado do cálculo para o usuário.
     *
     * @param resultado O resultado a ser exibido.
     */
    public void exibirResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    /**
     * Exibe uma mensagem de erro para o usuário.
     *
     * @param mensagem A mensagem de erro a ser exibida.
     */
    public void exibirMensagemDeErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }

    /**
     * Recebe a opção do usuário para continuar ou sair.
     *
     * @return 's' para continuar, 'n' para sair.
     */
    public char receberOpcao() {
        System.out.println("Deseja continuar? (s/n):");
        return scanner.next().toLowerCase().charAt(0);
    }

    /**
     * Fecha o Scanner.
     */
    public void fecharScanner() {
        scanner.close();
    }
}