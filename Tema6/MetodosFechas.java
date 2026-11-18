import java.util.Scanner;

public class MetodosFechas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a, m, d, n;
        a = LeeAñoValido();
        m = LeeMesValido(a);
        d = LeeDiaValido(a, m);
        n = DiaSemana(d, m, a);
        System.out.println("La fecha " + d + "/" + m + "/" + a + " corresponde a " + DiaEnLetra(n));
    }
    public static int LeeAñoValido() {
        int a;
        do {
            System.out.print("Dime un año desde 1583 en adelante: ");
            a = sc.nextInt();
            if (a < 1583) {
                System.out.println("Año no válido. Introduce otro.");
            }
        } while (a < 1583);
        return a;
    }
    public static int LeeMesValido(int a) {
        int m;
        do {
            System.out.print("Dime un mes (1-12): ");
            m = sc.nextInt();
            if (m < 1 || m > 12) {
                System.out.println("Mes no válido. Introduce otro.");
            }
        } while (m < 1 || m > 12);
        return m;
    }
    public static int LeeDiaValido(int a, int m) {
        int d;
        int dias = 31;
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            dias = 30;
        }
        if (m == 2) {
            if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
                dias = 29;
            } else {
                dias = 28;
            }
        }
        do {
            System.out.print("Dime un día válido: ");
            d = sc.nextInt();
            if (d < 1 || d > dias) {
                System.out.println("Día no válido. Este mes tiene "
                        + dias + " días.");
            }
        } while (d < 1 || d > dias);
        return d;
    }
    public static int DiaSemana(int d, int m, int a) {
        int mes, b, c, n;
        if (m == 1 || m == 2) {
            mes = m + 10;
            b = (a - 1) % 100;
            c = (a - 1) / 100;
        } else {
            mes = m - 2;
            b = a % 100;
            c = a / 100;
        }
        n = (700 + (26 * mes - 2) / 10 + d + b + b / 4
                + c / 4 - 2 * c) % 7;
        if (n == 0) {
            n = 7;
        }
        return n;
    }
    public static String DiaEnLetra(int nDia) {
        switch (nDia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Día no válido";
        }
    }
}