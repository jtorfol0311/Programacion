import java.util.Scanner;

public class RectanguloAsterisco {
    public static void main(String[] args) {
        int f;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime cuantas filas quieres que tenga el rectangulo: ");
        f = sc.nextInt();
        System.out.print("Dime cuantas columnas quieres que tenga el rectangulo: ");
        c = sc.nextInt();
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
