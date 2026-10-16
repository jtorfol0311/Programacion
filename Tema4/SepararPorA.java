import java.util.Scanner;

public class SepararPorA {
    public static void main(String[] args) {
        String palabra;
        int posicion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una palabra: ");
        palabra = sc.nextLine();
        posicion = palabra.indexOf("a");
        System.out.print(palabra.substring(0, posicion) + " " + palabra.substring(posicion));
        sc.close();
    }
}