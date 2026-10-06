import java.util.Scanner;

public class Ejercicio303 {
public void main(String[] args){
    int fecha;
    Scanner sc = new Scanner(System.in);
    System.out.print("Dime tu mes y tu dia de nacimiento: ");
    fecha = sc.nextInt();
    if (fecha >= 321 && fecha <= 419) {
        System.out.println("Tu signo es Aries");
    } else if (fecha >= 420 && fecha <= 520) {
        System.out.println("Tu signo es Tauro");
    } else if (fecha >= 521 && fecha <= 620) {
        System.out.println("Tu signo es Geminis");
    } else if (fecha >= 621 && fecha <= 722) {
        System.out.println("Tu signo es Cancer");
    } else if (fecha >= 723 && fecha <= 822) {
        System.out.println("Tu signo es Leo");
    } else if (fecha >= 823 && fecha <= 922) {
        System.out.println("Tu signo es Virgo");
    } else if (fecha >= 923 && fecha <= 1022) {
        System.out.println("Tu signo es Libra");
    } else if (fecha >= 1023 && fecha <= 1121) {
        System.out.println("Tu signo es Escorpio");
    } else if (fecha >= 1122 && fecha <= 1221) {
        System.out.println("Tu signo es Sagitario");
    } else if (fecha >= 1222 && fecha <= 119) {
        System.out.println("Tu signo es Capricornio");
    } else if (fecha >= 120 && fecha <= 218) {
        System.out.println("Tu signo es Acuario");
    } else if (fecha >= 219 && fecha <= 320) {
        System.out.println("Tu signo es Piscis");
    } else {
        System.out.println("La fecha introducida no es correcta");
    }
  }
}