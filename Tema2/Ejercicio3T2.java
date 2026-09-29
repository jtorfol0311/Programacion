import java.util.Scanner;

public class Ejercicio3T2 {
public static void main(String[] args) {
    int mb;
    int kb;
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime un numero de megabytes: ");
    mb = sc.nextInt();
    kb = mb * 1024;
    System.out.println(mb + " megabytes son: " + kb + " kilobytes");
  }
}