import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ab1Aufgabe3 extends JFrame {

    Container c;

    JRadioButton rbRot, rbGelb, rbGruen;
    JButton bu1, bu2, bu3;

    public Ab1Aufgabe3 () {
        c = getContentPane();
        c.setLayout(new GridLayout(3,2));

        rbRot = new JRadioButton("rot");
            rbRot.setSelected(true); //von Anfang an ausgewählt
        rbGelb = new JRadioButton("gelb");
        rbGruen = new JRadioButton("gruen");

        ButtonGroup gruppe = new ButtonGroup();
        gruppe.add(rbRot);
        gruppe.add(rbGelb);
        gruppe.add(rbGruen);

        bu1 = new JButton();
        bu1.setBackground(Color.red);
        bu2 = new JButton();
        bu2.setBackground(Color.black);
        bu3 = new JButton();
        bu3.setBackground(Color.black);

        c.add(rbRot);
        c.add(bu1);
        c.add(rbGelb);
        c.add(bu2);
        c.add(rbGruen);
        c.add(bu3);

        AmpelListener Am = new AmpelListener();

        rbRot.setActionCommand("rot");
        bu1.setActionCommand("rot");
        rbGelb.setActionCommand("gelb");
        bu2.setActionCommand("gelb");
        rbGruen.setActionCommand("gruen");
        bu3.setActionCommand("gruen");

        rbRot.addActionListener(Am);
        bu1.addActionListener(Am);
        rbGelb.addActionListener(Am);
        bu2.addActionListener(Am);
        rbGruen.addActionListener(Am);
        bu3.addActionListener(Am);

    }

    public class AmpelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent a) {
            String ActCom = a.getActionCommand();

            if (ActCom.equals("rot")){
                bu1.setBackground(Color.red);
                bu2.setBackground(Color.black);
                bu3.setBackground(Color.black);
                rbRot.setSelected(true);
            }
            else if (ActCom.equals("gelb")) {
                bu1.setBackground(Color.black);
                bu2.setBackground(Color.yellow);
                bu3.setBackground(Color.black);
                rbGelb.setSelected(true);
            }
            else if (ActCom.equals("gruen")) {
                bu1.setBackground(Color.black);
                bu2.setBackground(Color.black);
                bu3.setBackground(Color.green);
                rbGruen.setSelected(true);
            }
        }
    }

    public static void main (String[] args){
        Ab1Aufgabe3 Fenster = new Ab1Aufgabe3();
        Fenster.setTitle("Ampel");
        Fenster.setSize(300,150);
        Fenster.setVisible (true);
        Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
