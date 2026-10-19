import java.util.Scanner;

public class nombrealmacenado {
    public static void main(String[] args){
        String nombre;
        String ape1;
        String ape2;
        int esp1;
        int esp2;
        String nom;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre y tus dos apellidos: ");
        nombre = sc.nextLine();
        esp1 = nombre.indexOf(" ");
        nom = nombre.substring(0, esp1);
        esp2 = nombre.indexOf(" ");
        ape1 = nombre.substring(esp1, esp2);
        ape2 = nombre.substring(esp2);
        System.out.println("El nombre es " + nom);
        System.out.println("El primer apellido es " + ape1);
        System.out.println("El segundo apellido es " + ape2);
        sc.close();
    }
}