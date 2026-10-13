public class baraja {
    public static void main(String[] args) {
      int palos = 1 + (int) (Math.random() * 4); 
      int cartas = 1 + (int) (Math.random() * 13);
      
      if (palos == 1) {
        if (cartas >= 2 && cartas <= 10) {
          System.out.println(cartas + " de picas");
        } else if (cartas == 11) {
          System.out.println(  "J de picas");
        } else if (cartas == 12) {
          System.out.println(  "Q de picas");
        } else if (cartas == 13) {
          System.out.println(  "K de picas");
        } else if (cartas == 1) {
          System.out.println(  "A de picas");
        }
    } else if (palos == 2) {
        if (cartas >= 2 && cartas <= 10) {
          System.out.println(cartas + " de corazones");
        } else if (cartas == 11) {
          System.out.println(  "J de corazones");
        } else if (cartas == 12) {
          System.out.println(  "Q de corazones");
        } else if (cartas == 13) {
          System.out.println(  "K de corazones");
        } else if (cartas == 1) {
          System.out.println(  "A de corazones");
        } 
    } else if (palos == 3) {
        if (cartas >= 2 && cartas <= 10) {
          System.out.println(cartas + " de diamantes");
        } else if (cartas == 11) {
          System.out.println(  "J de diamantes");
        } else if (cartas == 12) {
          System.out.println(  "Q de diamantes");
        } else if (cartas == 13) {
          System.out.println(  "K de diamantes");
        } else if (cartas == 1) {
          System.out.println(  "A de diamantes");
        }
    } else if (palos == 4) {
        if (cartas >= 2 && cartas <= 10) {
          System.out.println(cartas + " de treboles");
        } else if (cartas == 11) {
          System.out.println(  "J de treboles");
        } else if (cartas == 12) {
          System.out.println(  "Q de treboles");
        } else if (cartas == 13) {
          System.out.println(  "K de treboles");
        } else if (cartas == 1) {
          System.out.println(  "A de treboles");
        }
  }
}
}