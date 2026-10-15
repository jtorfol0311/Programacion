import java.util.Scanner;

public class NumeroPartido {
    public static void main(String[] args) {
        String num;
        int posicion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.next();
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        posicion = sc.nextInt();
        System.out.println(num.substring(0, posicion));
        System.out.println(num.substring(posicion));
        sc.close();
    }
}