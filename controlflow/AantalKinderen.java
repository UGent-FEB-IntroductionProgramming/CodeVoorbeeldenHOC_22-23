import java.util.Scanner;

public class AantalKinderen {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Aantal kinderen:");
        int aantalKinderen = keyb.nextInt();

        switch (aantalKinderen){
            case 1:
                System.out.println("Proficiat !!");
                break;
            case 2:
                System.out.println("Proficiat een tweeling !!");
                break;
            case 3:
                System.out.println("Waow een drieling");
                break;
            case 4:
                System.out.println("Vierling");
                break;
            default:
                System.out.println("Dit geloof ik niet");
        }

    }
}
