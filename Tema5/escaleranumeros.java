public class escaleranumeros{
    public static void main(String[] args){
        for (int fila = 1; fila <= 4; fila++){
            for (int i = 1; i <= fila; i++) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int fila = 1; fila <= 4; fila++){
            for (int i = fila; i >= 1; i--) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}