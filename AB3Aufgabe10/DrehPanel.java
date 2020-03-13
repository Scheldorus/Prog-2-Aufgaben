package AB3Aufgabe10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrehPanel extends JPanel {

    static final double SCHRITTWEITE = Math.PI/60;
    GeoObjekt drehObjekt;
    JButton b1, b2, b3, b4;

    public DrehPanel () {
        b1 = new JButton("Links");
        b2 = new JButton("Rechts");
        b3 = new JButton("Strecke");
        b4 = new JButton("Dreieck");

        this.setLayout(new FlowLayout() );

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);

        drehObjekt = erzeugeStrecke();

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drehObjekt.drehen(-SCHRITTWEITE);
                repaint();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drehObjekt.drehen(+SCHRITTWEITE);
                repaint();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drehObjekt = erzeugeStrecke();
                repaint();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drehObjekt = erzeugeDreieck();
                repaint();
            }
        });

    }
        public Strecke erzeugeStrecke() {
            Punkt a = new Punkt(0,0);
            return new Strecke (a, new Punkt(100,0) );
        }

        public Dreieck erzeugeDreieck() {
            Punkt a = new Punkt(0,0);
            return new Dreieck ( a, new Punkt(100, 0), new Punkt(50, -66) );
        }

        public void paintComponent (Graphics g) {
            super.paintComponent(g);
            drehObjekt.zeichnen(g, this.getWidth()/2, this.getHeight()/2);
        }


}
