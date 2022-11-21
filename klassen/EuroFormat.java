public class EuroFormat {
    public static void writePositive(double amount){
        int allCents = (int) (Math.round(amount * 100));
        int euros = allCents / 100;
        int cents = allCents % 100;

        System.out.print("€ ");
        System.out.print(euros);
        System.out.print('.');
        if(cents < 10)
            System.out.print('0');
        System.out.print(cents);
    }

    public static void write(double amount){
        if(amount > 0)
            writePositive(amount);
        else
        {
            System.out.print("-");
            writePositive(Math.abs(amount));
        }
    }

    public static void main(String[] args) {
        write(-34.8875);
    }
}
