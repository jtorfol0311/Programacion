import java.util.Scanner;

public class Practica3 {
public static void main(String[] args){
    double n1;
    double n2;
    double n3;
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime el primer numero: ");
    n1 = sc.nextDouble();
    System.out.print("Dime el segundo numero: ");
    n2 = sc.nextDouble();
    System.out.print("Dime el tercer numero: ");
    n3 = sc.nextDouble();
    if (n1 < n2 && n1 < n3){
        System.out.println("El numero " + n1 + " es el mas pequeño");
    } else if (n2 < n1 && n2 < n3){
        System.out.println("El numero " + n2 + " es el mas pequeño");
    } else if (n3 < n1 && n3 < n2){
        System.out.println("El numero " + n3 + " es el mas pequeño");
    } else {
        System.out.println("Todos los numeros son iguales");
    }
  }
}