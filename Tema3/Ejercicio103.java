import java.util.Scanner;

public class Ejercicio103 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime un dia de la semana: ");
    String dia = sc.next();
    if (dia.equals("Lunes")){
        System.out.println("El "+ dia + " a primera toca lenguaje de programación");
    } else if (dia.equals("Martes") || dia.equals("martes")){
        System.out.println("El "+ dia + " a primera toca base de datos");
    } else if (dia.equals("Miercoles") || dia.equals("miercoles")){
        System.out.println("El "+ dia + " a primera toca sistemas informaticos");
    } else if (dia.equals("Jueves") || dia.equals("jueves")){
        System.out.println("El "+ dia + " a primera toca programacion");
    } else if (dia.equals("Viernes") || dia.equals("viernes")){
        System.out.println("El "+ dia + " a primera toca Entorno de desarrollo");
    } else {
        System.out.println("Ese dia no hay clases o no existe");
    }
    sc.close();
  }
}