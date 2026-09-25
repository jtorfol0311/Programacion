import java.util.Scanner;

public class calculaminutos {
public static void main(String[] args) {
    int segundos;
    int minutos;
    int horas;
    int segundosrestantes;
    int minutosrestantes;
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculamos el numero y segundos, dada una cantidad de segundos");
    System.out.println("Ingresa una cantidad de segundos:");
    segundos = sc.nextInt();
    minutos = segundos / 60;
    horas = minutos / 60;
    minutosrestantes = minutos % 60;
    segundosrestantes = segundos % 60;
    System.out.println("El numero de horas es " + horas + ", el numero de mintos es " + minutosrestantes + " y el numero de segundos restantes es " + segundosrestantes);
 }
}