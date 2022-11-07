import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        // Aftellen vanaf bepaald getal
        int getal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een getal:");
        getal = input.nextInt();

        // Countdown met while

        //while(getal > 0){
        //    System.out.println(getal);
        //    getal--;
        //}

        //int counter = 0;
        //while(counter <= getal){
        //    System.out.print(counter + ", ");
        //    counter++;
        //}


        //Countdown met for

        for(int counter = 0; counter <= getal; counter = counter + 2) {
            System.out.print(counter + ", ");

        }

        System.out.println("Start !!!!");
    }
}