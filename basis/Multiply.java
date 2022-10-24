import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Wat is het eerste getal?");
        int getal1 = keyb.nextInt();
        System.out.println("Wat is het tweede getal?");
        int getal2 = keyb.nextInt();
        System.out.println("Het product van " + getal1 + " en " + getal2 + " is " + getal1*getal2 + ".");


    }


}