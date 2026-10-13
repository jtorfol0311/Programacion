import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        int original;
        int inverso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero entero de hasta 5 cifras como maximo: ");
        original = sc.nextInt();
        int n = original;
        while (n != 0){
        inverso = inverso * 10 + n % 10;
        n = n / 10;
        }
        if (inverso == original) {
            System.out.println("El numero " + original + " es capicua");
        } else if (inverso != original) {
            System.out.println("El numero " + original + " no es capicua");
        } else {
            System.out.println("El numero no es valido");
        }
        sc.close();
    }
}