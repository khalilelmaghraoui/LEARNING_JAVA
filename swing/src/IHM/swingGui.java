package IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class swingGui extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;

    private JButton b1;
    private JButton button1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    ImageIcon icon;
    protected JCheckBox checkBox;
    JLabel checkLabel;

    protected ImageIcon createImageIcon(String path,
                                        String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }



    public swingGui(String title ) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.button1.setBackground(Color.ORANGE);
     //   this.setMinimumSize(new Dimension(500,500));
        icon = new ImageIcon("images/icon.png");
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(20,20, Image.SCALE_AREA_AVERAGING);
        icon = new ImageIcon(newImage);
        button1.setIcon(icon);


        b1.setToolTipText("Click this button to disable "
            + "the middle button.");
        b2.setToolTipText("This middle button does nothing "
            + "when you click it.");
        b3.setToolTipText("Click this button to enable the "
            + "middle button.");



        this.pack();


    }


}

