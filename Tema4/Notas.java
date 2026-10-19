import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        double n1, n2, n3, n4, n5;
        double n1alza, n2alza, n3alza, n4alza, n5alza;
        double n1baja, n2baja, n3baja, n4baja, n5baja;
        long n1trun, n2trun, n3trun, n4trun, n5trun;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la primera nota: ");
        n1 = sc.nextDouble();
        System.out.print("Dime la segunda nota: ");
        n2 = sc.nextDouble();
        System.out.print("Dime la tercera nota: ");
        n3 = sc.nextDouble();
        System.out.print("Dime la cuarta nota: ");
        n4 = sc.nextDouble();
        System.out.print("Dime la quinta nota: ");
        n5 = sc.nextDouble();
        n1alza = Math.ceil(n1);
        n2alza = Math.ceil(n2);
        n3alza = Math.ceil(n3);
        n4alza = Math.ceil(n4);
        n5alza = Math.ceil(n5);
        n1baja = Math.floor(n1);
        n2baja = Math.floor(n2);
        n3baja = Math.floor(n3);
        n4baja = Math.floor(n4);
        n5baja = Math.floor(n5);
        n1trun = Math.round(n1);
        n2trun = Math.round(n2);
        n3trun = Math.round(n3);
        n4trun = Math.round(n4);
        n5trun = Math.round(n5);
        media = (n1 + n2 + n3 + n4 + n5) / 5;
        double maximo; 
        double minimo;
        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
            maximo = n1;
        } else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
            maximo = n2;
        } else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
            maximo = n3;
        } else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
            maximo = n4;
        } else {
            maximo = n5;
        }

        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
            minimo = n1;
        } else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) {
            minimo = n2;
        } else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
            minimo = n3;
        } else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
            minimo = n4;
        } else {
            minimo = n5;
        }
        System.out.println("La primera nota alza es " + n1alza + ", a la baja es " + n1baja + " y truncada es " + n1trun);
        System.out.println("La segunda nota alza es " + n2alza + ", a la baja es " + n2baja + " y truncada es " + n2trun);
        System.out.println("La tercera nota alza es " + n3alza + ", a la baja es " + n3baja + " y truncada es " + n3trun);
        System.out.println("La cuarta nota alza es " + n4alza + ", a la baja es " + n4baja + " y truncada es " + n4trun);
        System.out.println("La quinta nota alza es " + n5alza + ", a la baja es " + n5baja + " y truncada es " + n5trun);
        System.out.println("La media de las cinco notas es " + media);
        System.out.println("La nota maxima es " + maximo + " y la nota minima es " + minimo);
        sc.close();
    }
}