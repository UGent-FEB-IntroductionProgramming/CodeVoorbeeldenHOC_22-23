import java.util.Scanner;

/*
Dit was mijn eerste programma
datum: ....
Vragen: ....
 */

public class FirstProgram {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("eerste getal ?");
        String lineGetala = keyb.nextLine(); // deze aanpak is beter voor inlezen data via console
        int a = Integer.parseInt(lineGetala);
        System.out.println("tweede getal ?");
        int b = keyb.nextInt();
        int c = a + b;
        String result  = "de som is:" + c;
        System.out.println(result);

    }
}

