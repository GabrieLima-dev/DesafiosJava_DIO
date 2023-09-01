import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = Double.parseDouble(scanner.next());
        double periodo = scanner.nextDouble();

        double valorFinal = valorInicial * (Math.pow((1 + taxaJuros), periodo));

        String resultado = String.format("%.2f", valorFinal);
        System.out.println("Valor final do investimento: R$ " + resultado);

        scanner.close();
    }
}git commitr