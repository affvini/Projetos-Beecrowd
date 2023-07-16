import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        int percentual;
        double ganho;

        if (salario <= 400.00) {
            percentual = 15;
            ganho = salario * 0.15;
        } else if (salario <= 800.00) {
            percentual = 12;
            ganho = salario * 0.12;
        } else if (salario <= 1200.00) {
            percentual = 10;
            ganho = salario * 0.10;
        } else if (salario <= 2000.00) {
            percentual = 7;
            ganho = salario * 0.07;
        } else {
            percentual = 4;
            ganho = salario * 0.04;
        }

        double novoSalario = salario + ganho;


        System.out.println(String.format("Novo salario: %.2f", novoSalario));
        System.out.println(String.format("Reajuste ganho: %.2f",  ganho));
        System.out.println("Em percentual: " + percentual + " %");
    }
}
