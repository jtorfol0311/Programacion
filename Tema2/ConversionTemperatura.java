import java.util.Scanner;

public class ConversionTemperatura {
public static void main(String[] args) {
    double celsius;
    double fahrenheit;
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la temperatura en grados fahrenheit: ");
    fahrenheit = sc.nextDouble();
    celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println("La temperatura en grado celsius es: " + celsius);
 }
}