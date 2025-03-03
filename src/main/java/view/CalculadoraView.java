package view;


import java.util.Scanner;

public class CalculadoraView {


    private Scanner scanner;

    public CalculadoraView() {
        this.scanner = new Scanner(System.in);
    }


    // methods de entrada de dados

public double receberNumero(String mensagem) {

    System.out.println(mensagem);
    return scanner.nextDouble();
}

public char receberOperacao() {
    System.out.println("Digite a operação desejada(+, -, *, /):");
    return scanner.next().charAt(0);

}

public void exibirResultado(double resultado) {

        System.out.println("Resutltado: " + resultado);
}

public void exibirMensagemDeErro(String mensagem) {
    System.out.println("Erro: " + mensagem);

}

public char receberOpcao() {
    System.out.println("Deseja continuar? (s/n)");
   return scanner.next().toLowerCase().charAt(0);


}

public void fecharScanner() {
        scanner.close();
    }
}

