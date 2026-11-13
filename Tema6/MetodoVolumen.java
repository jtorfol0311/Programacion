import java.util.Scanner;

public class MetodoVolumen {
    public static void main(String[] args) {
        int r;
        int h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el radio del cilindro: ");
        r = sc.nextInt();
        System.out.print("Dime la altura del cilindro: ");
        h = sc.nextInt();
        System.out.println("El volumen del cilindro es " + VolumenCilindro(r, h));
        sc.close();
    }
    public static double VolumenCilindro(int r, int h){
        double volumen;
        volumen = Math.PI * Math.pow(r, 2) * h;
        return volumen;
    }
}