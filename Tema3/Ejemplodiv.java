import java.util.Scanner;

public class Ejemplodiv {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("Introduce un número: ");
    num = sc.nextInt();
    if (num % 2 == 0 && num % 3 == 0){
        System.out.println(num + " es divisible por 2 y 3");
    } else if (num % 2 == 0 || num % 3 == 0){
        System.out.println(num + " es divisible por 2 o por 3");
    } else if (num % 2 == 0 ^ num % 3 == 0){
        System.out.println(num + " es divisible por 2 o por 3 pero no ambos");
    } else {
        System.out.println(num + " no es divisible ni por 2 ni por 3");
    }
    sc.close();
  }
}