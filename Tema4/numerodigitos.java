import java.util.Scanner;

public class numerodigitos {
    public static void main(String[] args) {
        String num;
        int cantidad;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        num = sc.next();
        char ch;
        boolean digitos = true;
        while (i < num.length()) {
            ch = num.charAt(i);
            if (!Character.isDigit(ch))
                digitos = false;
            i++;
        }
        if (digitos) {
                System.out.println("El numero esta formado por digitos");
            } else {
                System.out.println("El numero no esta formado por digitos");
            }
        cantidad = num.length();
        if (cantidad < 2 || cantidad > 7) {
            System.out.println("El numero no tiene entre 2 y 7 digitos");
        } else {
            System.out.println("El numero " + num + " tiene entre 2 y 7 digitos");
        }
        sc.close();
    }
}