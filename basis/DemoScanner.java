import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Geef een getal (int)");
        String getalStr = keyb.nextLine();
        //System.out.println("Test:" + getalStr);
        int getal1 = Integer.parseInt(getalStr);
        System.out.println("Input:" + getal1);
        System.out.println("Geef een getal (double)");
        double getal2 = Double.parseDouble(keyb.nextLine());
        System.out.println("Input:" + getal2);
        System.out.println("Geef een char ");
        String line = keyb.nextLine();
        System.out.println("Input:" + line);

    }
}
