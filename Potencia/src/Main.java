import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);

        double a = 0,resultado=0;
        int tipo;

        System.out.println("Número: ");
        a=console.nextDouble();

        System.out.println("1: Al cuadrado.\n 2:Al cubo");
        tipo=console.nextInt();

        switch (tipo){
            case 1: resultado=Math.pow(a, 2);
                System.out.println(resultado);break;
            case 2: resultado=Math.pow(a, 3);
                System.out.println(resultado);break;

        }
    }
}