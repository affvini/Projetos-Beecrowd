import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int hora;

        if (inicio >= fim) {
           hora = 24 - (inicio - fim);
            System.out.println("O JOGO DUROU " + hora + " HORAS(S)");
        } else if (inicio <= fim) {
            hora = fim - inicio;
            System.out.println("O JOGO DUROU " + hora + " HORAS(S)");
        }
    }
}