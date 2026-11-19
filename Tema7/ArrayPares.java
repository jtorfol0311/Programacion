public class ArrayPares {
    public static void main(String[] args){
        int[] pares = new int[101];
        int i = 1;
        while(i <= 100) {
            if(i % 2 == 0){
            pares[i] = i;
            System.out.println(pares[i]);
            }
        i++;
        }
    }
}