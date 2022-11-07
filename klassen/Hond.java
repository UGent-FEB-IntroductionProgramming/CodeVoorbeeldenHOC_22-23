public class Hond {
    public String naam;
    public String ras;
    public int leeftijd;

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
