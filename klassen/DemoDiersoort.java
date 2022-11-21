

public class DemoDiersoort {
    public static void main(String[] args) {

        Diersoort soort1 = new Diersoort("Klingon Ex",1000, 10);
        Diersoort soort2 = new Diersoort("Klingon Ex",1000, 10);
        //soort1.readInput();
        //soort1.setDierSoort("Klingon Ex",1000, 10);
        //soort2.setDierSoort("Klingon Ex",100, 10);

        if(soort1.equals(soort2))
            System.out.println("Ze zijn gelijk");
        soort1.writeOutput();

        System.out.println("Populatie na 10 jaar: " + soort1.getPopulation(10));
        System.out.println("Populatie na 20 jaar: " + soort1.getPopulation(20));

    }




}
