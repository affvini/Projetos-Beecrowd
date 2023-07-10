import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);


        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = (float)((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        double novamedia = 0;

        System.out.println(String.format("Media: %.1f", media));
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media < 7 && media >= 5) {
            System.out.println("Aluno em exame.");
            double n5 = sc.nextDouble();
            System.out.println(String.format("Nota do exame: %.1f", n5));
            novamedia = (media + n5) / 2;
            if (novamedia >= 5.0) {
                System.out.println(String.format("Aluno aprovado."));
            } else if (novamedia <= 4.9) {
                System.out.println(String.format("Aluno reprovado."));

            }
            System.out.println(String.format("Media final: %.1f", novamedia));
        }


    }
}