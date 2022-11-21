public class SavingsAccount {
    private double balance;
    public static double interestRate = 0;
    public static int aantalAccounts = 0;

    public SavingsAccount() {
        balance =  0;
        aantalAccounts++;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static int getAantalAccounts() {
        return aantalAccounts;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setInterestRate(double interestRate) {
        SavingsAccount.interestRate = interestRate;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void addInterest(){
        double interest = balance * interestRate;
        balance = balance + interest;
    }

    public static void showBalance(SavingsAccount account){
        System.out.println(account.getBalance());
    }
}
