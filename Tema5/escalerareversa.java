public class escalerareversa{
    public static void main(String[] args){
        final int Max = 4;
        System.out.println();
        for (int fila = 1; fila <= Max; fila++){
            for (int j = Max*3 - fila*3; j > 0; j--)
                System.out.print(" ");
            for (int i = fila; i >= 1; i--) { 
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}