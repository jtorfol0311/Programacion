import java.util.Scanner;

public class ArrayNumeroInverso {
    public static void main(String[] args){
        int[] numero = new int[10];
        int[] inverso = NumeroInverso(numero);
        System.out.println("El numero invertido es: ");
        for(int i = 0; i < inverso.length; i++){
            System.out.print(inverso[i] + " ");
        }

    }
    public static int[] NumeroInverso(int[] numero){    
        int[] resultado = new int[numero.length]; 
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(i < numero.length){
            System.out.print("Dime un numero: ");
            numero[i] = sc.nextInt();
        i++;
        }
        for(int j = 0, k = resultado.length - 1; j < numero.length; j++, k--){
            resultado[j] = numero[k];
        }
        return resultado;        
    }
}