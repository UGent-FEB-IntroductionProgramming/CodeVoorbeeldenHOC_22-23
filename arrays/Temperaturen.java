import java.util.Scanner;

public class Temperaturen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Aantal temeraturen?");
        int aantal = Integer.parseInt(input.nextLine());
        double[] temperaturen = new double[aantal];
        System.out.println("Geef " + temperaturen.length + " temperaturen:");
        double som = 0;
        for(int i = 0; i < temperaturen.length; i++){
            double temp = Double.parseDouble(input.nextLine());
            temperaturen[i] = temp;
            som += temp;
        }

        double gem = som / temperaturen.length;

        System.out.println("De gemiddelde temperatuur is: " + gem);
        printTemperaturen(temperaturen);


    }

    private static void printTemperaturen(double[] temperaturen){
        for(int i = 0; i < temperaturen.length; i++){
            System.out.println("Temp " + i + ": " + temperaturen[i]);
        }

    }
}
