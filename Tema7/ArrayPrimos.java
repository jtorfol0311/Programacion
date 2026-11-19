public class ArrayPrimos {
    public static void main(String[] args){
        int[] primos = new int[101];
        int i = 0;
        int p = 0;
        EsPrimo(i, p, primos);
    }
    public static int EsPrimo(int i, int p, int[] primos){
        boolean esPrimo = true;
        while(i <= 100){
            esPrimo = true;
            if(i <= 2){
                esPrimo = false;
            } else {
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        esPrimo = false;
                    } 
                }
                if(esPrimo){
                    primos[p] = i;
                    System.out.println(primos[p]);
                p++;
                }
            }
        i++; 
        }
    return primos[p];
    }
}