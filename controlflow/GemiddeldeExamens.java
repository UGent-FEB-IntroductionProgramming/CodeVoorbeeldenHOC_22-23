import java.util.Scanner;

public class GemiddeldeExamens {
    public static void main(String[] args) {
        System.out.println("Dit programma bepaalt het gemiddelde van");
        System.out.println("een lijst van (niet-negative) examen scores.");
        double sum; // manier om gemiddelde te berekenen: komt later nog terug
        int numberOfStudents;
        double next; // volgende getal dat wordt ingelezen: lijn 20
        String answer;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("Geef the scores voor de examens.");
            System.out.println("Geef een negatief getal nadat");
            System.out.println("je alle scores hebt ingegeven.");
            sum = 0;
            numberOfStudents = 0;
            next = keyboard.nextDouble();
            while (next >= 0) { // deze while loop geldt enkel indien getal groter is dan 0.
                sum = sum + next;
                numberOfStudents++;
                next = keyboard.nextDouble();
                // hierboven bepaal je enkel de som, nog niet het gemiddelde.
            }

            if (numberOfStudents > 0)
                System.out.println("Het gemiddelde is " + (sum / numberOfStudents));
            else
                System.out.println("Geen scores.");
            System.out.println("Het gemiddelde bepalen van een ander examen?");
            System.out.println("Geef ja of nee.");
            answer = keyboard.next();
        }
        while (answer.equalsIgnoreCase("ja")); // wensen we de do-loop nog eens te doen? Soort van 2de lus. Indien 'yes' begint do-loop volledig opnieuw.
    }
}
