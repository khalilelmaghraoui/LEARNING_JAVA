package IHM;

import javax.swing.*;
import java.awt.*;

public class panel{
     panel() {
         ImageIcon imageIcon = new ImageIcon("images/png.png"); // load the image to a imageIcon
         Image image = imageIcon.getImage(); // transform it
         Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
         imageIcon = new ImageIcon(newimg);  // transform it back

         JLabel label = new JLabel();
         label.setToolTipText("icon");
         label.setIcon(imageIcon);
         label.setVerticalAlignment(JLabel.TOP);
         label.setHorizontalAlignment(JLabel.RIGHT);



         JPanel RedPanel = new JPanel();
         RedPanel.setBackground(Color.RED);
         RedPanel.setBounds(0,0,250,250);


         JPanel BluePanel = new JPanel();
         BluePanel.setBackground(Color.blue);
         BluePanel.setBounds(250,0,250,250);
         BluePanel.setLayout(new BorderLayout());

         JPanel blackPanel = new JPanel();
         blackPanel.setBackground(Color.black);
         blackPanel.setBounds(0,250,500,500);






         frame panelFrame = new frame();
         panelFrame.setTitle("panel title");

         BluePanel.add(label);
         panelFrame.add(RedPanel);
         panelFrame.add(blackPanel);
         panelFrame.add(BluePanel);


         panelFrame.setLayout(null);
         panelFrame.setVisible(true);


    }
}
