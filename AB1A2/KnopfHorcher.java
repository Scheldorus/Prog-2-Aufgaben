package AB1A2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KnopfHorcher implements ActionListener {
    JLabel lb;
    public KnopfHorcher(JLabel lb){
        this.lb = lb;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Date datum = new Date();
        lb.setText(Ab1Aufgabe2.gewaehlt.format(datum));
    }
}

