public class caracteres2 {
    public static void main(String[] args) {
        char c = 0;
        int contador = 1;
        int random = (int)(Math.random() * 6) + 1;
        while(contador <= 5){
        if (random == 1)
            c = '*';
        else if (random == 2)
            c = '-';
        else if (random == 3)
            c = '=';
        else if (random == 4)
            c = '.';
        else if (random == 5)
            c = '|';
        else if (random == 6)
            c = '@';

        contador++;
        System.out.print(c);
        }
    }
}