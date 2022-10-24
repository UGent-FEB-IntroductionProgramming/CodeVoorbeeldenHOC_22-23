import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Geef een getal (int)");
        int getal1 = keyb.nextInt();
        System.out.println("Input:" + getal1);
        System.out.println("Geef een getal (double)");
        double getal2 = keyb.nextDouble();
        System.out.println("Input:" + getal2);
        System.out.println("Geef een char ");
        String line = keyb.nextLine();
        System.out.println("Input:" + line);

    }
}
