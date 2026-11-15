import java.util.Scanner;

public class MetodoDivisoresPrimos {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero para sacar sus divisores primos: ");
        n = sc.nextInt();
        System.out.println("Los divisores primos del numero " + n + " son: "); 
        divisoresprimos(n);
    }
    public static void divisoresprimos(int n){
        int i = 2;
        int j;
        int primo;
        while(i <= n){
            j = 2;
            primo = 1;
            if(n % i == 0){
                while(j <= i){
                    if(i % j == 0 && i != j){
                    primo = 0;
                    }
                j++;
                }
            if (primo == 1){
                System.out.println(i);
                }
                }
            i++;
        }
    }
}