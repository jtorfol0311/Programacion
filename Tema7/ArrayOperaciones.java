import java.util.Scanner;

public class ArrayOperaciones{
    public static void main(String[] args){
        int[] n = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n.length; i++){
            System.out.print("Dime un numero: ");
            n[i] = sc.nextInt();
        }
        System.out.println("La suma de todo el arry es: " + Suma(n));
        System.out.println("La resta de todo el array es: " + Resta(n));
        System.out.println("La multiplicación de todo el array es: " + Multiplicacion(n));
        System.out.println("La división de todo el array es: " + Division(n));
    }
    public static int Suma(int[] n){
        int resultado = 0;
        for(int i = 0; i < n.length; i++ ){
            resultado += n[i];
        }
        return resultado;
    }
    public static int Resta(int[] n){
        int resultado = n[0];
        for(int i = 1; i < n.length; i++){
            resultado -= n[i]; 
        }
        return resultado;
    }
    public static int Multiplicacion(int[] n){
        int resultado = 1;
        for(int i = 0; i < n.length; i++){
            resultado *= n[i];
        }
        return resultado;
    }
    public static double Division(int[] n){
        double resultado = n[0];
        for(int i = 1; i < n.length; i++){
            resultado /= n[i];
        }
        return resultado;
    } 
}