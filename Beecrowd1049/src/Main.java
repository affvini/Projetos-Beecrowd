import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        String sf = ler.nextLine();
        String c = ler.nextLine();
        String o = ler.nextLine();

        if(sf.equals("vertebrado")){
            if(c.equals("ave")){
                if(o.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if(o.equals("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(c.equals("inseto")){
                if(o.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(o.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}