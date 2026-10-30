import java.util.Scanner;

public class CuadradoNumerico {
    public static void main(String[] args) {
        int f;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime cuantas filas quieres: ");
        f = sc.nextInt();
        System.out.print("Dime cuantas columnas quieres: ");
        c = sc.nextInt();
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
