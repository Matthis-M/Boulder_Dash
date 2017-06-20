package view;

import java.awt.Color;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
  public Fenetre(){                
	  this.setTitle("a premi�re fen�tre java");
      this.setSize(500, 300);
      this.setLocationRelativeTo(null);              
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
       
      //On pr�vient notre JFrame que ce sera notre Panneau2 qui �tend JPanel qui sera son contentPane
      Panneau pan = new Panneau();
      
      //On consid�re l'instance de Panneau2 comme contentPane de Fenetre2 
      this.setContentPane(pan);
    
      this.setVisible(true);
  }     
}