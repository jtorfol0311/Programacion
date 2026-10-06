import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {
        int año;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        año = sc.nextInt();
        if (año % 4 == 0 && año % 100 !=0 || año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
        sc.close();
    }
}