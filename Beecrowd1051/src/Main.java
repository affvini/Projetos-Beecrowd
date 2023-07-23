import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double renda = sc.nextDouble();
        double saidaOito;
        double saidaDezoito;
        double restoSaida;
        double saidaSoma;
        double imposto;
        double diferenca;

        if (renda < 2000.00){
            System.out.println("Isento");
        } else if (renda < 3000.00){
            restoSaida = renda - 2000;
            saidaOito = restoSaida * 8/100;
            System.out.println(String.format("R$ %.2f", saidaOito));
        } else if (renda <= 4500.00){
            restoSaida = renda - 2000;
            saidaOito = 1000.00 * 8/100;
            saidaDezoito = (restoSaida - 1000.00) * 18/100;
            saidaSoma = saidaOito + saidaDezoito;
            System.out.println(String.format("R$ %.2f", saidaSoma));
        } else if (renda > 4500.00){
            imposto = 1000 * 0.08 + 1500 * 0.18;
            diferenca = renda - 4500;
            imposto = imposto + diferenca * 0.28;
            System.out.println(String.format("R$ %.2f", imposto));

        }

    }
}