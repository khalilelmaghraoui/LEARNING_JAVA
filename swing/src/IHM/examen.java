package IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class examen extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu compteur ;
    JMenu renitialiser;

    JMenuItem Incrémentation;
    JMenuItem Décrémentation;
    JMenuItem Réinitialisation;
    JLabel label;

    JTextField text;
    JButton incrémenter;
    JButton decrémenter;
    JButton réinitialisation;
    JPanel mainPanle = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    private static int cmpt;

    examen(){


        menuBar=new JMenuBar();
        this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

        compteur=new JMenu("Compteur");
        renitialiser=new JMenu("renitialiser");
        Incrémentation=new JMenuItem("incrementer");
        Décrémentation =new JMenuItem("incrementer");
        Réinitialisation =new JMenuItem("renitialiser");

        label =new JLabel("compteur:");


         text = new JTextField("                  0");
         text.setHorizontalAlignment(JTextField.LEFT);

        incrémenter =new JButton("incrementer");
        incrémenter.addActionListener(this);

        incrémenter.setSize(10,10);


        decrémenter =new JButton("Decrementer");
        decrémenter.setSize(10,10);
        decrémenter.addActionListener(this);

        réinitialisation =new JButton("reintialisation");
        renitialiser.addActionListener(this);

        compteur.add(Incrémentation);
        compteur.add(Décrémentation);
        renitialiser.add(Réinitialisation);
        menuBar.add(compteur);
        menuBar.add(renitialiser);




        this.add(label);
        this.add(text);
        this.add(réinitialisation);
        this.add(incrémenter);
        this.add(decrémenter);

        this.setJMenuBar(menuBar);




        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();


    }

    public static void main(String[] args) {
        examen frame=new examen();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrémenter || e.getSource() == decrémenter) {
            cmpt--;
            text.setText(String.valueOf(cmpt));
        }
        if (e.getSource() == incrémenter || e.getSource() == incrémenter) {
            cmpt++;
            text.setText(String.valueOf(cmpt));
        }
        if (e.getSource() == renitialiser || e.getSource() == renitialiser){
            cmpt = 0;
            text.setText(String.valueOf(cmpt));
        }
    }
}
