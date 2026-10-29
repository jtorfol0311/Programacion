import java.util.Scanner;

public class SumaTotal {
    public static void main(String[] args) {
        int n = 1;
        int i = 0;
        System.out.println("Para terminar la suma pulsa 0");
        while(n != 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime un numero que quieras sumar: ");
            n = sc.nextInt();
            i=n+i;
        }
        System.out.println("El total es: " + i);
        sc.close();
    }
}