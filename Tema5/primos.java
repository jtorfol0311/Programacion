public class primos {
    public static void main(String[] args){
        final int primos = 14;
        boolean esPrimo;
        int num = 2;
        int i = 0;
        while(i <= primos){
            esPrimo = true;
            if (num <= 1)
                esPrimo = false;
            else {
            for (int j = 2; j < num; j++){
                if (num % j == 0)
                    esPrimo = false;
            }
            if (esPrimo) {
                i++;
                if (i > primos)
                    System.out.print(num);
                else
                    System.out.print(num + ", ");
            }
            num++;
        }
    }
}
}