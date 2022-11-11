import java.util.Scanner;

public class Diersoort {
    private String naam;
    private int population;
    private double groei;

    public Diersoort(String naam, int population, double groei) {
        this.naam = naam;
        this.population = population;
        this.groei = groei;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGroei() {
        return groei;
    }

    public void setGroei(double groei) {
        this.groei = groei;
    }

    /*
    public void setDierSoort(String naam, int population, double groei){
        this.naam = naam;
        this.population = population;
        this.groei = groei;

    }*/

    public void readInput(){
        Scanner keyb = new Scanner(System.in);
        System.out.println("Naam Diersoort");
        this.naam = keyb.nextLine();
        //setName(keyb.nextLine());
        System.out.println("Startpopulatie?");
        this.population = Integer.parseInt(keyb.nextLine());
        System.out.println("Groei ?");
        System.out.println("Groei ?");
        groei = Double.parseDouble(keyb.nextLine());
    }

    public void writeOutput(){
        System.out.println("Diersoort{" +
                "name='" + naam + '\'' +
                ", population=" + population +
                ", groei=" + groei +
                '}');
    }

    public double getPopulation(int years){
        //int result = 0;
        double population = this.population;
        int count = years;
        while((count > 0 ) && (population > 0)){
            population = population + (groei / 100) * population;
            count--;
        }
        return population;
    }

    public boolean equals(Diersoort soort){
        if(this.naam.equals(soort.getNaam()) && this.population == soort.getPopulation())
            return true;
        return false;
    }

}
