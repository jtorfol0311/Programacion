import java.util.Scanner;

public class NumeroIntroducido {
    public static void main(String[] args) {
        String num;
        int posicion;
        long insertar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        num = sc.next();
        System.out.print("Introduzca la posición donde quiere insertar: ");
        posicion = sc.nextInt();
        System.out.print("Introduzca el dígito que quiere insertar: ");
        insertar = sc.nextLong();
        System.out.print("El número resultante es " + num.substring(0, posicion -1) + insertar + num.substring(posicion));
        sc.close();
    }
}