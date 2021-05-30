package Tp;

import javax.swing.*; import java.awt.event.*;
     import java.awt.*; import javax.swing.event.*;

        class Fenetre extends JFrame implements ItemListener
    {
              private String  []  couleurs = {"rouge", "vert", "bleu", "gris", "jaune"};
              private JComboBox boite; Container c;
              /*
              http://www.neophytes.info/java/d12.html

               */

              public Fenetre()
             {
                  setTitle("Changement dynamique des couleurs");
                 setSize(300, 300);
                 c = getContentPane();
                 c.setLayout( new FlowLayout() );
                  boite = new JComboBox(couleurs);
                  c.add(boite);
                 boite.addItemListener(this);
                 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
              }

            public void itemStateChanged(ItemEvent i)
            {
                 int choix = boite.getSelectedIndex();

                switch(choix)
                 {
                     case 0:
                     c.setBackground(new Color(255, 0, 0) );
                   break;

                      case 1:
                    c.setBackground(new Color(0, 255, 0) );
                     break;

                     case 2 :
                     c.setBackground(new Color(0, 0, 255) );
                      break;

                     case 3:
                     c.setBackground(new Color(208, 208, 208) );
                     break;

                    default:
                   c.setBackground(new Color(255, 255, 0) );
                    break;
               }
          }
    }

      class ChangementDeCouleur
    {
          public static void main(String [] args)
           {
               Fenetre f = new Fenetre();
                  f.setVisible(true);
             }
      }
