public class ArrayPares {
    public static void main(String[] args){
        int[] pares = new int[51];
        int i = 0;
        while(i < pares.length) {
            pares[i] = i * 2;
            System.out.println(pares[i]);
        i++;
        }
    }
}