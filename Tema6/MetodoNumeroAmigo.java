import java.util.Scanner;

public class MetodoNumeroAmigo{
    public static void main(String[] args){
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        n1 = sc.nextInt();
        System.out.print("Dime otro numero: ");
        n2 = sc.nextInt();
        SumaDivisoresn1(n1);
        SumaDivisoresn2(n2);
        NumeroAmigo(n1, n2);
    }
    public static int SumaDivisoresn1(int n1){
        int i = 1;
        int div = 0; 
        while(i < n1){
            if(n1 % i == 0){
                div+=i;
            }
        i++;
        }
    return div;
    }
    public static int SumaDivisoresn2(int n2){
        int i = 1;
        int div = 0;
        while (i < n2){
            if(n2 % i == 0){
                div+=i;
            }
        i++;
        }
    return div;
    }
    public static void NumeroAmigo(int n1, int n2){
        if(SumaDivisoresn1(n1) == n2 && SumaDivisoresn2(n2) == n1){
            System.out.println("Los numeros " + n1 + " y " + n2 + " son amigos");
        } else {
            System.out.println("Los numeros " + n1 + " y " + n2 + " no son amigos");
        }
    }
}