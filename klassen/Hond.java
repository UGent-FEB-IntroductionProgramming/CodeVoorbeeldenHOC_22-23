public class Hond {
    private String naam;
    private String ras;
    private int leeftijd;

    public Hond(String naam, String ras, int leeftijd){
        this.naam = naam;
        this.ras = ras;
        this.leeftijd = leeftijd;
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
}
