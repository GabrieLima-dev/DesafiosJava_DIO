import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor = 0;
        try {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                valor = scanner.nextDouble();
                if (valor > 0) {
                    String resultado = String.format("%.2f", valor);
                    System.out.println("Deposito realizado com sucesso!\n" +
                            "Saldo atual: R$ " + resultado);
                    break;
                } else if (valor == 0) {
                    System.out.println("Encerrando o programa...");
                    break;
                }
            }
        } catch (java.util.NoSuchElementException e) {
            if (valor < 0) {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            }
        }

    }
}