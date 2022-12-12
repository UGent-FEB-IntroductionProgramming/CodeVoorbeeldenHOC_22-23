public class Cirkel implements Meetbaar {
    private double straal;

    // omtrek = 2 pi r
    // opp = pi r^2

    public Cirkel(double straal) {
        this.straal = straal;
    }

    @Override
    public double bepaalOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double bepaalOpp() {
        return Math.PI * straal * straal;
    }
}
