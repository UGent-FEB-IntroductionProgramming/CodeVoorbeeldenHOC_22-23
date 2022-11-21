import java.util.Scanner;

public class DimensionConverterDemo {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Aantal feet:");
        double feet = Double.parseDouble(keyb.nextLine());
        //DimensionConverter test = new DimensionConverter();
        double inches = DimensionConverter.convertFeetToInches(feet);
        System.out.println("aantal inches" + inches);
    }
}
