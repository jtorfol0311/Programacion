import java.util.Scanner;

public class Ejercicio1T2 {
    public static void main(String[] args) {
     int horas;
     int semanal;
     Scanner sc = new Scanner(System.in);
     System.out.print("Dime tus horas trabajadas a la semana: ");
     horas = sc.nextInt();
     semanal = horas * 12;
     System.out.println("Tu salario semanal es: " + semanal );
    }
}