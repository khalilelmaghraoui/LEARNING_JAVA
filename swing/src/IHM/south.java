package IHM;

import javax.swing.*;
import java.awt.*;

public class south extends JFrame {

    south(){

        JPanel mainPnale = new JPanel(new BorderLayout());
        JPanel panel = new JPanel();



        JButton button = new JButton("hello1");
        panel.add(button);

        //panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        mainPnale.add(panel,BorderLayout.PAGE_END);


        this.add(mainPnale);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        south s = new south();
        s.setSize(400,400);
        s.setVisible(true);

    }
}
