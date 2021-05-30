package IHM;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class fenetre extends JFrame  {
     JRadioButton radioButton1 = new JRadioButton();
     JRadioButton radioButton2 = new JRadioButton();
     JRadioButton radioButton3 = new JRadioButton();
     JRadioButton radioButton4 = new JRadioButton();
     ButtonGroup buttonGroup;
     ButtonGroup buttonGroup2;
     ButtonGroup buttonGroup3;


    fenetre()
    {
        frame frame1 = new frame();
        JPanel panelcontent= new JPanel();
        panelcontent.setBorder(new EmptyBorder(5,5,5,5));
        panelcontent.setLayout(new BorderLayout(0,0));



       // frame1.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        frame1.setLayout(null);
        buttonGroup = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup2.add(radioButton4);
        buttonGroup2.add(radioButton3);
        radioButton1.setText("adulte");
        radioButton2.setText("enfant");
        radioButton3.setText("travailleur");
        radioButton4.setText("chômeur");
        radioButton1.setSize(100,100);
        radioButton1.setSize(100,100);
//        radioButton3.setSize(100,100);
//        radioButton4.setSize(100,100);
        radioButton3.setVisible(false);
        radioButton4.setVisible(false);


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.add(radioButton3);
        panel1.add(radioButton4);


        panelcontent.add(panel1,"South");
        panelcontent.add(panel1,"South");





        radioButton1.setBounds(0,0,100,50);
        radioButton2.setBounds(100,0,100,50);




        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radioButton3.setVisible(true);
                radioButton4.setVisible(true);
            }
        });
        setContentPane(panelcontent);

        frame1.add(radioButton1);

        frame1.add(radioButton2);
        frame1.add(radioButton3);
        frame1.add(radioButton4);
        frame1.add(panelcontent);






    }


}
