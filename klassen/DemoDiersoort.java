public class DemoDiersoort {
    public static void main(String[] args) {
        Diersoort soort1 = new Diersoort();
        soort1.readInput();
        soort1.writeOutput();

        System.out.println("Populatie na 10 jaar: " + soort1.getPopulation(10));
        System.out.println("Populatie na 20 jaar: " + soort1.getPopulation(20));

    }




}
