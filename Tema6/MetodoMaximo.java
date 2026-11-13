import java.util.Scanner;

public class MetodoMaximo {
    public static void main(String[] args){
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Dime el segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("El maximo es el " + maximo(n1, n2));
        sc.close();
    }    
    public static int maximo(int n1, int n2) {
        return Math.max(n1, n2);
    } 
}