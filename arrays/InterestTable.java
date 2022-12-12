public class InterestTable {
    public static void main(String[] args) {
        final int RIJEN = 10;
        final int KOLOMMEN = 6;

        int[][] bedragen = new int[RIJEN][KOLOMMEN];
        double startbedrag = 1000.0;

        for (int row = 0; row < RIJEN; row++) {
            for (int col = 0; col < KOLOMMEN; col++) {
                bedragen[row][col] = getBalance(startbedrag, row + 1, (5 + 0.5 * col));
            }
        }

        for (int row = 0; row < RIJEN; row++) {
            for (int col = 0; col < KOLOMMEN; col++) {
                System.out.print(bedragen[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int getBalance(double startbalance, int years, double rate){
        double runningBalance = startbalance;
        for(int count = 1; count <= years; count++){
            runningBalance = runningBalance * (1 + rate/100);
        }
        return (int) (Math.round(runningBalance));
    }
}
