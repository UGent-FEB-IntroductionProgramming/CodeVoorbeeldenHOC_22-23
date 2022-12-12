public class Rechthoek implements Meetbaar {
    private double lengte;
    private double breedte;

    //omtrek: (L+B)*2
    //opp: L*B

    public Rechthoek(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public double bepaalOmtrek() {
        return (lengte + breedte ) * 2;
    }

    @Override
    public double bepaalOpp() {
        return lengte * breedte;
    }
}
