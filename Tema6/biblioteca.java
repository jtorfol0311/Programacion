import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args){
        int ele = 0;
        Scanner sc = new Scanner(System.in);
        while(ele != 7){
            System.out.println("1. esCapicua");
            System.out.println("2. potencia");
            System.out.println("3. digitos");
            System.out.println("4. voltea");
            System.out.println("5. quitaPorDetras");
            System.out.println("6. pegaPorDelante");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            ele = sc.nextInt();
            switch(ele) {
                case 1:
                    int original;
                    System.out.print("Dime un numero: ");
                    original = sc.nextInt();
                    System.out.println(esCapicua(original));
                    break;
                case 2:
                    int base;
                    int potencia;
                    System.out.print("Dime un numero de base: ");
                    base = sc.nextInt();
                    System.out.print("Dime un numero como potencia");
                    potencia = sc.nextInt();
                    System.out.println(potencia(base, potencia));
                    break;
                case 3:
                    String n;
                    System.out.print("Dime un numero: ");
                    n = sc.next();
                    System.out.println(digitos(n));
                    break;
                case 4:
                    int o;
                    System.out.print("Dime un numero para darle la vuelta:");
                    o = sc.nextInt();
                    System.out.println(voltea(o));
                    break;
                case 5:
                    String d;
                    int q;
                    System.out.print("Dime un numero: ");
                    d = sc.next();
                    System.out.print("Dime cuantos numeros quito: ");
                    q = sc.nextInt();
                    System.out.println(quitaPorDetras(d, q));
                    break;
                case 6:
                    String j;
                    int s;
                    System.out.print("Dime un numero: ");
                    j = sc.next();
                    System.out.print("Dime un digito para añadir: ");
                    s = sc.nextInt();
                    System.out.println(pegaPorDelante(j, s));
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
        }
        public static boolean esCapicua(int original) {
            int inverso = 0;
            int i = original;
            boolean j = false;
            while(i != 0){
                inverso = inverso * 10 + i % 10;
                i /= 10;
            }
            return inverso == original;
        }
        public static int potencia(int base, int potencia){
            int resultado = 1;
            int i = 0;
            while(i < potencia){
                resultado *= base;
                i++;
            }
            return resultado;
        }
        public static int digitos(String n){
            return n.length();
        }
        public static int voltea(int o){
            int v = 0;
            int i = o;
            while(i != 0){
                v = v * 10 + i % 10;
                i /= 10;
            }
            return v;
        }
        public static String quitaPorDetras(String d, int q){
            return d.substring(0, d.length() - q);
        }
        public static String pegaPorDelante(String j, int s){
            return s + j;
        }
}