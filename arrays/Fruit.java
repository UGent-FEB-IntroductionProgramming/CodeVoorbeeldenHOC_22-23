import java.util.Arrays;

public class Fruit implements Comparable{
    private String naam;

    public Fruit(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public static void main(String[] args) {
        Fruit appel = new Fruit("Appel");
        Fruit peer = new Fruit("peer");
        Fruit kiwi = new Fruit("Kiwi");

        Fruit[] fruitmand = new Fruit[3];

        fruitmand[0] = appel;
        fruitmand[1] = peer;
        fruitmand[2] = kiwi;
        printFruitMand(fruitmand);
        Arrays.sort(fruitmand);
        printFruitMand(fruitmand);

    }

    private static void printFruitMand(Fruit[] fruitmand){
        for(int i = 0; i < fruitmand.length; i++){
            System.out.println(fruitmand[i].getNaam());
        }
    }



    public int compareTo(Object o) {
        Fruit fruit = (Fruit) o;
        if(this.getNaam().length() > fruit.getNaam().length())
            return 1;
        if(this.getNaam().length() == fruit.getNaam().length())
            return 0;
        else
            return -1;
    }
}
