import java.util.Scanner;

public class Ejercicio2T2 {
    public static void main(String[] args) {
    double h;
    double r;
    double v;
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime la altura del cono: ");
    h = sc.nextDouble();
    System.out.print("Dime el radio del cono: ");
    r = sc.nextDouble();
    v = 1.14159 * r * r * h / 3;
    System.out.println("El volumen del cono es: " + v);
    }
}