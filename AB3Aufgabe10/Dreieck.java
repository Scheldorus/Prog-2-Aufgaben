package AB3Aufgabe10;

import java.awt.Graphics;
import java.awt.*;

public class Dreieck implements GeoObjekt {
    protected Punkt a, b, c;
    private Strecke s1, s2, s3;

    public Dreieck(Punkt a, Punkt b, Punkt c){
        this.a = a;
        this.b = b;
        this.c = c;

        s1 = new Strecke(a,b);
        s2 = new Strecke(b,c);
        s3 = new Strecke(c,a);
    }

    @Override
    public void drehen(double phi) {
        a.drehen(phi);
        b.drehen(phi);
        c.drehen(phi);
    }

    @Override
    public void zeichnen(Graphics g, int xNull, int yNull) {
        s1.zeichnen(g, xNull, yNull);
        s2.zeichnen(g, xNull, yNull);
        s3.zeichnen(g, xNull, yNull);

    }
}
