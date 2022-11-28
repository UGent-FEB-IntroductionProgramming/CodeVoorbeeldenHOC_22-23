public class InterestTable {
    public static void main(String[] args) {

    }

    public static int getBalance(double startbalance, int years, double rate){
        double runningBalance = startbalance;
        for(int count = 1; count <= years; count++){
            runningBalance = runningBalance * (1 + rate/100);
        }
        return (int) (Math.round(runningBalance));
    }
}
