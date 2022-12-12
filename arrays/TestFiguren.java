public class TestFiguren {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(4);
        Rechthoek rechthoek = new Rechthoek(4,6);
        printOmtrekEnOppervlakte(cirkel);
        printOmtrekEnOppervlakte(rechthoek);
    }

    public static void printOmtrekEnOppervlakte(Meetbaar meetbaar){
        System.out.println("De omtrek is: " + meetbaar.bepaalOmtrek());
        System.out.println(("De oppervlakte is: " + meetbaar.bepaalOpp()));
    }
}
