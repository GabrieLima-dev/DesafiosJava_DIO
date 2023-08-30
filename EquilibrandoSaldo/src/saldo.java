import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();

        double valorDeposito = scanner.nextDouble();

        double valorRetirada = scanner.nextDouble();

        scanner.close();

        double saldo = ((saldoAtual + valorDeposito) - valorRetirada);

        String resultado = String.format("%.1f", saldo);
        System.out.println("Saldo autalizado na conta: " + resultado);

    }
}
