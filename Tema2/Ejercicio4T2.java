import java.util.Scanner;

public class Ejercicio4T2 {
public static void main(String[] args) {
    double mb;
    double kb;
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime un numero de kilobytes: ");
    kb = sc.nextDouble();
    mb = kb / 1024;
    System.out.println(kb + " kilobytes son: " + mb + " megabytes");
  }
}