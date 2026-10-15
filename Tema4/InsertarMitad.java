import java.util.Scanner;

public class InsertarMitad {
    public static void main(String[] args) {
        String mensaje;
        int mitad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una palabra: ");
        mensaje = sc.nextLine();
        mitad = mensaje.length() / 2;
        System.out.println(mensaje.substring(0, mitad) + "<>" + mensaje.substring(mitad));
        sc.close();
    }
}