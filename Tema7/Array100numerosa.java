public class Array100numerosa {
    public static void main(String[] args){
        int[] numeros = new int[101];
        int i = 1;
        while(i <= 100){
            numeros[i] = i;
            System.out.println(numeros[i]);
        i++;
        }
    }
}