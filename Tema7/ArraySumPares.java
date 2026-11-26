public class ArraySumPares{
    public static void main(String[] args){
        int[] p = new int[101];
        int resultado = 0;
        for(int i = 1; i < p.length; i++){
            if(i % 2 == 0){
            p[i] = i;
            resultado += p[i];
            }
        }
        System.out.println("La suma de los numeros pares entre 1 y 100 es : " + resultado);
    }
}