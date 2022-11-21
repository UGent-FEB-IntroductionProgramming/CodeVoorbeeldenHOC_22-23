package hond;

public class Hond {
    private String naam;
    private String ras;
    private int leeftijd;

    public static int getAantalHonden() {
        return aantalHonden;
    }

    public static void setAantalHonden(int aantalHonden) {
        Hond.aantalHonden = aantalHonden;
    }

    private static int aantalHonden = 0;

    public Hond(String naam, String ras, int leeftijd){
        this.naam = naam;
        this.ras = ras;
        this.leeftijd = leeftijd;
        aantalHonden++;
    }

    public Hond(String naam) {
        this.naam = naam;
        this.ras ="Niet geweten";
        this.leeftijd = -1;
    }

    public String getNaam(){
        return naam;
    }

    public String getRas(){
        return ras;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public void writeOutput(){
        System.out.println("Naam hond:" + naam);
        System.out.println(("Ras hond: " + ras));
        System.out.println("Leeftijd hond: " + leeftijd);
        System.out.println(("Leeftijd hond in mensenjaren: " + geefLeeftijdInMensenJaren()));
    }

    public static void writeOutput2(Hond hond){
        System.out.println("Naam hond:" + hond.naam);
        System.out.println(("Ras hond: " + hond.ras));
        System.out.println("Leeftijd hond: " + hond.leeftijd);
        System.out.println(("Leeftijd hond in mensenjaren: " + hond.geefLeeftijdInMensenJaren()));
    }


    public int geefLeeftijdInMensenJaren(){
        //int leeftijdMensen = 0;
        if(leeftijd <= 2) {
            return leeftijd * 11;
            //return leeftijdMensen;
        }
        else {
            return  22 + ((leeftijd - 2) * 5);
            //return leeftijdMensen;
        }

    }

    public static void main(String[] args) {


        Hond jackie = new Hond("Jackie", "Labradoedel", 3); //constructor
        jackie.writeOutput();
        writeOutput2(jackie);

        Hond odette = new Hond("odette", "vizsla", 2);
        System.out.println("Aantal honden:" + Hond.getAantalHonden());

    }

}
