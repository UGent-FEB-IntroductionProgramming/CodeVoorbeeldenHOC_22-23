import java.util.Scanner;

public class FirstProgram {
        public static void main(String[] args) {
            Scanner keyb = new Scanner(System.in);
            System.out.println("eerste getal ?");
            int a = keyb.nextInt();
            System.out.println("tweede getal ?");
            int b = keyb.nextInt();
            int c = a + b;
            System.out.println("de som is:" + c);

        }
    }

