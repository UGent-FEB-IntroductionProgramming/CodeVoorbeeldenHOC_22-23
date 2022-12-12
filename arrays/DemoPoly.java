public class DemoPoly {
    public static void main(String[] args) {
        Persoon[] personen = new Persoon[2];
        personen[0] = new Persoon("Merchiers","Tom","Oudenaarde", 1979, 10, 10);
        personen[1] = new Student("1234", "De Vos", "Paul", "Gent", 2000, 5,5);

        for(Persoon p: personen){
            System.out.println(p.toString());
        }
    }
}
