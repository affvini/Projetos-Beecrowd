import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        if (entrada == 1){
            System.out.println("January");
        } else if (entrada == 2){
            System.out.println("February");
        } else if (entrada == 3){
            System.out.println("March");
        } else if (entrada == 4){
            System.out.println("April");
        } else if (entrada == 5){
            System.out.println("May");
        } else if (entrada == 6){
            System.out.println("June");
        } else if (entrada == 7){
            System.out.println("July");
        } else if (entrada == 8){
            System.out.println("August");
        } else if (entrada == 9){
            System.out.println("September");
        } else if (entrada == 10){
            System.out.println("October");
        } else if (entrada == 11){
            System.out.println("November");
        } else if (entrada == 12){
            System.out.println("December");
        }
    }
}