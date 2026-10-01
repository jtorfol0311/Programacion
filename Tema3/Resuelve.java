import java.util.Scanner;

public class Resuelve {
public static void main(String[] args) {
    int random1 = (int) (Math.random() * 10.0);
    int random2 = (int) (Math.random() * 10.0);
    int respuesta;
    int resultado;
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime cual es la suma de " + random1 + " + " + random2);
    respuesta = sc.nextInt();
    resultado = random1 + random2;
    if (respuesta == resultado) {
        System.out.println("La respuesta es correcta");
    } else {
        System.out.println("La respuesta no es correcta, la respuesta correcta es " + resultado); 
    }
  }
}