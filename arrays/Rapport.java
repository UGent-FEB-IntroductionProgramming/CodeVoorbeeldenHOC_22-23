import java.util.Scanner;

public class Rapport {
    private Vertegenwoordiger[] vertegenwoordigers;
    private double min;
    private double gem;
    private double max;

    public Vertegenwoordiger[] getVertegenwoordigers() {
        return vertegenwoordigers;
    }

    public double getMin() {
        return min;
    }

    public double getGem() {
        return gem;
    }

    public double getMax() {
        return max;
    }

    public Rapport(int aantal) {
        this.vertegenwoordigers = new Vertegenwoordiger[aantal];
    }

    public void getData(){
        Scanner keyb = new Scanner(System.in);
        for(int i = 0; i < vertegenwoordigers.length; i++){
            System.out.println("Naam vertegenwoordiger " + i + 1 +":");
            String naam = keyb.nextLine();
            System.out.println("Omzet vertegenwoordiger " + i + 1 + ":");
            double omzet = Double.parseDouble(keyb.nextLine());
            Vertegenwoordiger vertegenwoordiger = new Vertegenwoordiger(naam, omzet);
            vertegenwoordigers[i] = vertegenwoordiger;

        }

    }

    public void berekenStatistieken(){
        double min = vertegenwoordigers[0].getOmzet();
        for(int i = 1; i < vertegenwoordigers.length; i++){
            if(vertegenwoordigers[i].getOmzet() < min)
                min = vertegenwoordigers[i].getOmzet();
        }
        this.min = min;

        double som = 0;
        for(int i = 0; i < vertegenwoordigers.length; i++){
            som = som + vertegenwoordigers[i].getOmzet();
        }
        this.gem = som / vertegenwoordigers.length;

    }

    public void printStatistieken() {

    }

    public static void main(String[] args) {
        Rapport rapport = new Rapport(3);
        rapport.getData();
    }
}
