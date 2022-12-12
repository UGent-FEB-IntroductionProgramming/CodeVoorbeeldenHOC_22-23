public class Student extends Persoon {
    private String studentenNummer;

    public Student(String studentenNummer, String naam, String voornaam, String woonplaats, int jaarGeboorte, int maandGeboorte, int dagGeboorte  ){
        super(naam, voornaam, woonplaats, jaarGeboorte, maandGeboorte, dagGeboorte);
        this.studentenNummer = studentenNummer;
    }

    public void writeOutput(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return  "Student{" +
                "studentennummer = '" + studentenNummer + '\'' +
                "naam='" + super.getNaam() + '\'' +
                ", voornaam='" + super.getVoornaam() + '\'' +
                ", woonplaats='" + super.getWoonplaats() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student test = new Student("123456", "Gailly","Fred","Gent", 1979, 05, 28 );
        test.writeOutput();
        //test.studentenNummer;


    }
}
