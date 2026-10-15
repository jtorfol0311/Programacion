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
        System.out.println("Los numeros partidos son el " + num.substring(0, posicion) + " y el " + num.substring(posicion));
        sc.close();
    }
}