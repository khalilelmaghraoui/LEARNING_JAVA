package IHM;

import javax.swing.*;
import java.awt.*;

public class Menu {
    JMenu menu, submenu,submenu2;
    JMenuItem i1, i2, i3, i4, i5 ,i6;

    Menu() {
        JFrame f = new JFrame("Menu and MenuItem Example");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Colors");
        submenu = new JMenu("Rouge");
        submenu2 = new JMenu("Vert");

        i3 = new JMenuItem("Rouge vif");
        i4 = new JMenuItem("Rouge pale");
        i5 = new JMenuItem("vert vif");
        i6 = new JMenuItem("vert pale");
        submenu.add(i3);
        submenu.add(i4);
        submenu2.add(i5);
        submenu2.add(i6);
        menu.add(submenu);
        menu.add(submenu2);
        mb.add(menu);
        i3.addActionListener(e-> f.getContentPane().setBackground(new Color(0xd9544d)));
        i4.addActionListener(e-> f.getContentPane().setBackground(new Color(255,208,208)));
        i5.addActionListener(e-> f.getContentPane().setBackground(new Color(0,255,0)));
        i6.addActionListener(e-> f.getContentPane().setBackground(new Color(208,255,208)));
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        f.setVisible(true);
    }

}
