package IHM;

import javax.swing.*;
import java.awt.*;


public class Button extends JFrame {
    JButton button;
    JLabel label;


     Button() {
         ImageIcon imageIcon = new ImageIcon("images/png.png"); // load the image to a imageIcon
         Image image = imageIcon.getImage(); // transform it
         Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
         imageIcon = new ImageIcon(newimg);  // transform it back

          ImageIcon imageIcon1 = new ImageIcon("images/icon.png"); // load the image to a imageIcon
         Image image1 = imageIcon1.getImage(); // transform it
         Image newimg1 = image1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
         imageIcon1 = new ImageIcon(newimg1);  // transform it back

         label = new JLabel();
         label.setIcon(imageIcon1);
         label.setBounds(150,250,150,150);
         label.setVisible(false);


         button = new JButton();
        button.setBounds(50,50,200,80);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setText("heeeeeeello !");
        button.setFont(new Font("Nuvel",Font.ITALIC,25));
        button.setForeground(new Color(0x123456));
        button.setBorder(BorderFactory.createBevelBorder(4,Color.black,Color.ORANGE));
        button.setIcon(imageIcon);

        button.setFocusable(false);
       // button.setEnabled(false); for  disable a button


        button.addActionListener(e->new frame());

         frame frame = new frame();
         frame.add(label);

        frame.setLayout(null);
        frame.setSize(500,500);
         frame.add(button);



    }
    
}
