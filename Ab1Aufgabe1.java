import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;


class  Ab1Aufgabe1 extends JFrame {
    Container c;
    JButton button1;

    public Ab1Aufgabe1 () {
        c = getContentPane();
        c.setLayout (new FlowLayout());

        button1 = new JButton("schwarz");
        c.add(button1);
        ButtonBearbeiter b = new ButtonBearbeiter();
        button1.addActionListener(b);
        MouseBearbeiter m = new MouseBearbeiter();
        c.addMouseListener(m);
    }
    class ButtonBearbeiter implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            c.setBackground (Color.BLACK);
        }
    }
    class MouseBearbeiter implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {

        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {
            c.setBackground (Color.WHITE);
        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }
    }

    public static void main (String[] args){
        Ab1Aufgabe1 Fenster = new Ab1Aufgabe1();
        Fenster.setTitle("black or white");
        Fenster.setSize(300,150);
        Fenster.setVisible (true);
        Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
