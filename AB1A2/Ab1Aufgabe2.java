package AB1A2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;


class Ab1Aufgabe2 extends JFrame {
    Container c;
    private JLabel beschriftung, datumsAnzeige;
    private JComboBox<String> formatAuswahl;
    private JButton aktualisierung;
    private Date datum;
    static final SimpleDateFormat kurz = new SimpleDateFormat("EE, dd. MMMM, h:mm");
    static final SimpleDateFormat mittel = new SimpleDateFormat("dd. MMMM, hh:mm:ss");
    static final SimpleDateFormat lang = new SimpleDateFormat("MM.dd.yyyy (HH:mm)");
    static public SimpleDateFormat gewaehlt = lang;

    public Ab1Aufgabe2 () {
        c = getContentPane();
        c.setLayout(new BorderLayout());

        formatAuswahl = new JComboBox<String>();
        formatAuswahl.addItem("Tag, Datum und Uhrzeit");
        formatAuswahl.addItem("Datum und Uhrzeit mit Sekunden");
        formatAuswahl.addItem("Datum mit Jahr und Uhrzeit");
        c.add(formatAuswahl, BorderLayout.NORTH);
        AnzeigeListener al = new AnzeigeListener();
        formatAuswahl.addItemListener(al);

        datumsAnzeige = new JLabel();
        c.add(datumsAnzeige ,  BorderLayout.EAST);

        datum = new Date();
        beschriftung = new JLabel("Datum und Uhrzeit: ");
        c.add(beschriftung, BorderLayout.WEST);

        aktualisierung = new JButton("Anzeige aktualisieren");
        c.add (aktualisierung , BorderLayout.SOUTH);
        KnopfHorcher kh = new KnopfHorcher(datumsAnzeige);
        aktualisierung.addActionListener(kh);


    }

    public class AnzeigeListener implements ItemListener{
        Date d = new Date();
        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            if(formatAuswahl.getSelectedIndex() == 0){
                gewaehlt = kurz;
            }
            else if (formatAuswahl.getSelectedIndex() == 1) {
                gewaehlt = mittel;
            }
            else if (formatAuswahl.getSelectedIndex() == 2) {
                gewaehlt = lang;
            }
            datumsAnzeige.setText(gewaehlt.format(d));
        }
    }

    public static void main (String[] args){
        Ab1Aufgabe2 Fenster = new Ab1Aufgabe2();
        Fenster.setTitle("Zeitangabe");
        Fenster.setSize(300,150);
        Fenster.setVisible (true);
        Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}