public class Werknemer extends Persoon{
    private String personeelsnummer;

    public Werknemer(String personeelsnummer, String naam, String voornaam, String woonplaats, int jaarGeboorte, int maandGeboorte, int dagGeboorte) {
        super(naam, voornaam, woonplaats, jaarGeboorte, maandGeboorte, dagGeboorte);
        this.personeelsnummer = personeelsnummer;
    }
}
