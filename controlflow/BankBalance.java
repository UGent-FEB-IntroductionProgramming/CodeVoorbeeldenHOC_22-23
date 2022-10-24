import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        final double INTEREST = 0.03;
        final double PENALTY = 8;
        Scanner key = new Scanner(System.in);
        System.out.println("Stand van je rekening?");
        double balance = key.nextDouble();

        if(balance > 0)
        {
            double som_extra = (balance * INTEREST) / 12;
            balance = balance + som_extra;
        }

        //else
        //    balance = balance - PENALTY;

        System.out.println("Nieuwe stand rekening:" + balance);
    }
}
