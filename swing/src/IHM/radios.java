package IHM;

import javax.swing.*;
import java.awt.*;

public class radios extends JFrame {
    JRadioButton radioButton ;
    JRadioButton radioButton2 ;
    ButtonGroup buttonGroup;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;


     radios() throws HeadlessException {
       //  JLabel label = new JLabel("radio label");
        // label.setBounds(0,0,1000,1000);
         frame frame = new frame();
         frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
         Panel panel = new Panel();

         button1 = new JButton("hello");
         button1.setVisible(false);




      //   label.setVisible(false);

         // RADIOBUTTON 1
         radioButton = new JRadioButton();
         radioButton.setBounds(0,0,100,50);
         radioButton.setText("adults");
         radioButton.addActionListener(e->button1.setVisible(true));

  // RADIOBUTTON 2

         radioButton2 = new JRadioButton();
         radioButton2.setBounds(0,0,100,50);
         radioButton2.setText("enfants");








        // frame.add(label);

         frame.setSize(500,500);
         frame.add(radioButton);
         frame.add(radioButton2);
         frame.add(button1);
         frame.setVisible(true);

       //  pack();




    }
}
