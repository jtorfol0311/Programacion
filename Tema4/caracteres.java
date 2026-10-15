public class caracteres {
    public static void main(String[] args){
        char c = 0;
        int random = (int)(Math.random() * 4);
        int contador = 1;
        if (random == 0)
            c = '#';
        else if (random == 1)
            c = '$';
        else if (random == 2)
            c = '€';
        else if (random == 3)
            c = '&';
        
        while (contador <= 5){
            contador++;
        } 
        System.out.println(c);       
    }
}