import java.util.Scanner;

public class Diersoort {
    private String name;
    private int population;
    private double groei;

    public void readInput(){
        Scanner keyb = new Scanner(System.in);
        System.out.println("Naam Diersoort");
        this.name = keyb.nextLine();
        System.out.println("Startpopulatie?");
        this.population = Integer.parseInt(keyb.nextLine());
        System.out.println("Groei ?");
        groei = Double.parseDouble(keyb.nextLine());
    }

    public void writeOutput(){
        System.out.println("Diersoort{" +
                "name='" + name + '\'' +
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
}
