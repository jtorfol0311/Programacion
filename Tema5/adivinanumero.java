import java.util.Scanner;

public class adivinanumero {
    public static void main(String[] args) {
        int num = -1;
        double random = (int)(Math.random() * 100); 
        Scanner sc = new Scanner(System.in);
        while (num != random) {
            System.out.print("Adivina el numero de entre 0 y 100: ");
            num = sc.nextInt();
            if (num == random) {
                System.out.println("Has adivinado el numero");
            } else if (num < random) {
                System.out.println("Demasiado bajo, intentalo de nuevo");
            } else if (num > random) {
                System.out.println("Demasiado alto, intentalo de nuevo");
            }
        }
        sc.close();
    }
}