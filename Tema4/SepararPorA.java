import java.util.Scanner;

public class SepararPorA {
    public static void main(String[] args) {
        String palabra;
        int posicion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una palabra: ");
        palabra = sc.nextLine();
        posicion = palabra.indexOf('a');
        if (posicion == -1){
            posicion = palabra.indexOf('A');
        }
        if (posicion == -1){
            System.out.println("Error: La cadena no contiene la letra a");
        } else {
            System.out.print(palabra.substring(0, posicion) + " " + palabra.substring(posicion));
        }
        sc.close();
    }
}