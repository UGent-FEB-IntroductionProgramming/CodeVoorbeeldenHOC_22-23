// https://dodona.ugent.be/nl/courses/770/series/8631/activities/765664865

import java.time.LocalDate;
import java.util.Objects;

public class Persoon {
    private String naam;
    private String voornaam;
    private String woonplaats;
    private LocalDate geboorteDatum;

    public Persoon(String naam, String voornaam, String woonplaats, int jaarGeboorte, int maandGeboorte, int dagGeboorte ) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.woonplaats = woonplaats;
        this.geboorteDatum = LocalDate.of(jaarGeboorte, maandGeboorte, dagGeboorte);
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public boolean isOuderDan(Persoon otherPersoon){
        return true;
    }

    public boolean isJongerDan(Persoon otherPersoonb){
        return true;
    }

    public boolean wonenInZelfdeStad(Persoon otherPersoon){
        return true;
    }

    public void writeOutput(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return Objects.equals(naam, persoon.naam) && Objects.equals(voornaam, persoon.voornaam) && Objects.equals(woonplaats, persoon.woonplaats) && Objects.equals(geboorteDatum, persoon.geboorteDatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, voornaam, woonplaats, geboorteDatum);
    }



    public boolean equals(Persoon x){
        return this.naam.equals(x.naam) && this.voornaam.equals(x.voornaam)
                && this.geboorteDatum.equals(x.geboorteDatum);
    }




}