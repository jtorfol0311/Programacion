import java.util.Scanner;

public class ArrayMedia{
    public static void main(String[] args){
        int[] n = new int[10];
        LeerNumero(n);
        System.out.println("La media de los numeros introducidos en el array es: " + Media(n));
    }
    public static int[] LeerNumero(int[] n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n.length; i++){
            System.out.println("Dime un numero: ");
            n[i] = sc.nextInt();
        }
        return n;
    }
    public static double Media(int[] n){
        int media = 0;
        double resultado;
        for(int i = 0; i < n.length; i++){
            media += n[i];
        }
        resultado = media / n.length;
        return resultado;
    }
}