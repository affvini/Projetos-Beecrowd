import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault( new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double trapezio = ((A + B) * C) / 2;
        double perimetro = A + B + C;

        if (A + B > C && A + C > B && B + C > A){
            System.out.println(String.format("Perimetro = %.1f", perimetro));
        } else {
            System.out.println(String.format("Area = %.1f", trapezio ));
        }

    }
}