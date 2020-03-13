package AB3Aufgabe10;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {
    Container c;
    DrehPanel jp;

    public Fenster (){
        c = getContentPane();
        jp = new DrehPanel();

        c.add(jp);
    }

    public static void main (String [] args){
        Fenster f = new Fenster ();
        f.setVisible(true);
        f.setSize(350,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

