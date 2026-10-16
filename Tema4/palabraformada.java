public class palabraformada {
    public static void main(String[] args){
      String Mayuscula = "";
      String Minuscula = "";
      int contador = 0;
      int numMay, numMin;
      char character;
      while (contador < 5) {
        numMay = (int) (65 + Math.random() *26);
        character = (char) numMay;
        Mayuscula = Mayuscula + character;
        numMin = numMay + 32;
        character = (char) numMin;
        Minuscula = Minuscula + character;
        contador++;
      }
      System.out.println(Mayuscula);
      System.out.println(Minuscula);
    }
} 