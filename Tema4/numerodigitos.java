import java.util.Scanner;

public class numerodigitos {
    public static void main(String[] args) {
        String num;
        int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        num = sc.next();
        cantidad = num.length();
        if (cantidad < 2 || cantidad > 7) {
            System.out.println("El numero no tiene entre 2 y 7 digitos");
        } else {
            System.out.println("El numero " + num + " tiene entre 2 y 7 digitos");
        }
        sc.close();
    }
}