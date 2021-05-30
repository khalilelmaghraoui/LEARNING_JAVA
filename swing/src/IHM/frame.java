package IHM;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class frame extends JFrame {

     frame() {
         this.setSize(600,700);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         // jFrame.setResizable(false); // this method is for set the size of the frame in the default size
         this.setTitle("title"); // set title of frame
          // make frame visible

        //  set image icon
         ImageIcon  image = new ImageIcon("images/icon.png"); // create an image icon
         this.setIconImage(image.getImage()); // change icon of frame
        // this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

         this.getContentPane().setBackground(new Color(20,180,12)); // change the color of the background  RGB
         //this.getContentPane().setBackground(new Color(0x123456)); // change the color of the background  hexadecimal
         this.setVisible(true);
    }

     // JFrame jFrame  = new JFrame(); // create frame for us , this is not visibil so we should set visibility to true





}
