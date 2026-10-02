import java.util.Scanner;

public class Practica2 {
public static void main(String[] args){
    double n1;
    double n2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime el primer numero: ");
    n1 = sc.nextDouble();
    System.out.print("Dime el segundo numero: ");
    n2 = sc.nextDouble();
    if (n1 < n2){
        System.out.println("El numero " + n2 + " es mayor que " + n1);
    } else if (n1 > n2){
        System.out.println("El numero " + n1 + " es mayor que " + n2);
    } else {
        System.out.println("Los dos numeros son iguales");
    } 
  }
}