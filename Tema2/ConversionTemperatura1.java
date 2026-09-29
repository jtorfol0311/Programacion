import java.util.Scanner;

public class ConversionFahrenheit {
public static void main(String[] args) {
    double fahrenheit;
    double celsius;
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la temperatura en grados celsius: ");
    celsius = sc.nextDouble();
    fahrenheit = (celsius * 9.0) / 5 + 32;
    System.out.println("La temperatura en grados fahrenheit es: " + fahrenheit);
 }
}