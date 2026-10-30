import java.util.Scanner;

public class CuadradoNumerico {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero para formar un cuadrado: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();   
    }
}
