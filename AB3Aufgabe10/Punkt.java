package AB3Aufgabe10;

public class Punkt {
    private double x, y;

    public Punkt (double x, double y) {
       this.x = x;
       this.y = y;

    }
    // x und y zurückliefern
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // x und y drehen
    public void drehen (double phi){
        double xP = x; double yP = y;
        double x = (xP * Math.cos(phi) - yP * Math.sin(phi));
        double y = (xP * Math.sin(phi) + yP * Math.cos(phi));
    }


}
