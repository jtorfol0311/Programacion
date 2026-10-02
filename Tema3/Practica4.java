import java.util.Scanner;

public class Practica4 {
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
    if (n1 < n2 && n2 < n3){
        System.out.println("El orden de menor a mayor es: " + n1 + ", " + n2 + ", " + n3);
    } else if (n1 < n3 && n3 < n2){
        System.out.println("El orden de menor a mayor es: " + n1 + ", " + n3 + ", " + n2);
    } else if (n2 < n1 && n1 < n3){
        System.out.println("El orden de menor a mayor es: " + n2 + ", " + n1 + ", " + n3);
    } else if (n2 < n3 && n3 < n1){
        System.out.println("El orden de menor a mayor es: " + n2 + ", " + n3 + ", " + n1);
    } else if (n3 < n1 && n1 < n2){
        System.out.println("El orden de menor a mayor es: " + n3 + ", " + n1 + ", " + n2);
    } else if (n3 < n2 && n2 < n1){
        System.out.println("El orden de menor a mayor es: " + n3 + ", " + n2 + ", " + n1);
    } else {
        System.out.println("Todos los numeros son iguales o hay numeros iguales");
    } 
  }
}