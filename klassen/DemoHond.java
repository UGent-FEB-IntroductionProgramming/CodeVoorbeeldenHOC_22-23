public class DemoHond {
    public static void main(String[] args) {
        Hond jackie = new Hond(); //constructor
        jackie.naam ="Jackie";
        jackie.ras ="Labradoedel";
        jackie.leeftijd = 3;

        int leeftijd =  jackie.geefLeeftijdInMensenJaren();
        jackie.writeOutput();

        Hond odette = new Hond();
        odette.naam = "odette";
        odette.ras = "vizsla";
        odette.leeftijd = 2;
        odette.writeOutput();

    }
}
