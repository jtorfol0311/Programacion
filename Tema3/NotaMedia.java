import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args){
        double nota1;
        double nota2;
        double media1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdusca la nota del primer control: ");
        nota1 = sc.nextDouble();
        System.out.print("Introdusca la nota del segundo control: ");
        nota2 = sc.nextDouble();
        media1 = (nota1 + nota2) / 2;
        if (nota1 >= 11 || nota2 >= 11) {
            System.out.println("La nota introducida no es valida");
        } else if (media1 >= 5) {
            System.out.println("Estas aprobado tu media es " + media1);
        } else if (media1 <= 5) {
            System.out.println("Estas suspendido tu media es " + media1 + ", tienes que hacer la recuperación");
            String res = sc.nextLine();
            System.out.print("Dime si has sido apto o no apto: ");
            res = sc.nextLine();
            if ("apto".equalsIgnoreCase(res)) {
                System.out.println("Has aprobado la recuperación tienes un 5 de media");
            } else if ("no apto".equalsIgnoreCase(res)) {
                System.out.println("Has suspendido la recuperación tu nota media es " + media1);
            }
        }
        sc.close();
    }
}