package IHM;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class label {
    label() {
        ImageIcon image = new ImageIcon("images/unnamed.png");
        Border border = BorderFactory.createLineBorder(Color.black,5,true);
            JLabel label = new JLabel();
            label.setText("bro , do you even code !");
            label.setIcon(image);
            label.setHorizontalTextPosition(JLabel.CENTER); // set text position left right or center of imageIcon
            label.setVerticalTextPosition(JLabel.TOP);// set text position TOP BOTTOM or center of imageIcon
            label.setForeground(Color.ORANGE); // set font color
            label.setFont(new Font("Nuvel",Font.PLAIN,20)); // set font of text
            label.setIconTextGap(-25); // set gap of text ot image
            label.setBackground(Color.pink); // set background color
            label.setOpaque(true); // display background color
            label.setBorder(border);
            label.setVerticalAlignment(JLabel.CENTER); // set vertical of text + icon within label
            label.setHorizontalAlignment(JLabel.CENTER);
           //label.setBounds(0,0,350,350); // set x,y position within frame  as well as dimensions
            frame frame = new frame();

          //  frame.setSize(500,500);
            frame.setTitle("label part");
           // frame.setLayout(null);
            frame.getContentPane().setBackground(Color.lightGray);
            frame.add(label);
            frame.pack();
    }
}
