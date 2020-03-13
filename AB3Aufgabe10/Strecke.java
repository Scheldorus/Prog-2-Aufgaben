package AB3Aufgabe10;

import java.awt.*;

public class Strecke implements GeoObjekt {
    private Punkt a, b;

    public Strecke (Punkt a, Punkt b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void drehen(double phi) {
      a.drehen(phi);
      b.drehen(phi);
    }

    @Override
    public void zeichnen(Graphics g, int xNull, int yNull) {
        g.drawLine( xNull + (int) a.getX(), yNull + (int) a.getY(), xNull + (int) b.getX() , yNull + (int) b.getY() );
    }

}
