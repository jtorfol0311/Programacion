public class Array100numerosd {
    public static void main(String[] args){
        int[] numeros = new int[101];
        int i = 100;
        while(i > 0 && i <= 100){
            numeros[i] = i;
            System.out.println(numeros[i]);
        i--;
        }
    }
}