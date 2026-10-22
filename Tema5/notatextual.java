import java.util.Scanner;

public class notatextual{
    public static void main(String[] args){
        double nota;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nota: ");
        nota = sc.nextDouble();
        if (nota < 0 || nota > 10){
            System.out.println("Nota invalida");
        }else if (nota >= 9){
            System.out.println("Sobresaliente");
        } else if (nota >= 7){
            System.out.println("Notable");
        } else if (nota >= 6){
            System.out.println("Bien");
        } else if (nota >= 5){
            System.out.println("Aprobado");
        } else if (nota >= 0){
            System.out.println("Suspendido");
        }
        sc.close();
    }
}