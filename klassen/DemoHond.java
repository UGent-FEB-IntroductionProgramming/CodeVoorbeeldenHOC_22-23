public class DemoHond {
    public static void main(String[] args) {
        Hond jackie = new Hond("Jackie", "Labradoedel", 3); //constructor
        //jackie.naam ="Jackie";
        //jackie.setNaam("Jackie");
        //jackie.ras ="Labradoedel";
        //jackie.setRas("Labradoedel");
        //jackie.leeftijd = 3;
        //jackie.setLeeftijd(3);

        int leeftijd =  jackie.geefLeeftijdInMensenJaren();
        jackie.writeOutput();

        Hond odette = new Hond("odette", "vizsla", 2);
        Hond bob = new Hond("Bob");
        //odette.naam = "odette";
        //odette.setNaam("odette");
        //odette.ras = "vizsla";
        //odette.setRas("vizsla");
        //odette.leeftijd = 2;
        //odette.setLeeftijd(2);
        odette.writeOutput();

    }
}
