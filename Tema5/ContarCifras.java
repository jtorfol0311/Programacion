import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {
        int n;
        int cifras = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero para contar cuantas cifras tienes: ");
        n = sc.nextInt(); 
        while(n != 0){
            n = n / 10;
            cifras ++;
        }
        System.out.println("El numero tiene " + cifras + " cifras");
    }
}