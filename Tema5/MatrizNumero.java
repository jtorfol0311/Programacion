import java.util.Scanner;

public class MatrizNumero {
    public static void main(String[] args) {
        int f;
        int c;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero de filas: ");
        f = sc.nextInt();
        System.out.print("Dime un numero de columnas: ");
        c = sc.nextInt();
        for(int i = 1; i <= f; i++){
            for(int j = 1; j <= c; j++){
                m = i * j;
                System.out.printf("%4d", m);
             }
            System.out.println();
        }
    }
}