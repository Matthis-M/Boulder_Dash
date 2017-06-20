package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		try {
			Image img = ImageIO.read(new File("i.png"));
			g.drawImage(img, 0, 0, this);
			//Pour une image de fond
			//g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}                
	} 

    //D�finition de sa couleur de fond
	Panneau(){
		this.setBackground(Color.BLACK);
	}
}