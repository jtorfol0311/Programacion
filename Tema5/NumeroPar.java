import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args){
        int n;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero para saber cuales son los numeros pares entre 1 ese numero: ");
        n = sc.nextInt();
        while(i <= n){
           if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}