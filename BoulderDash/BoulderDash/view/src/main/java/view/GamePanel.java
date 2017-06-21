package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class GamePanel extends JPanel {
	
	private int X;
	private int Y;
	private int T;
	private int S;
	
	private String imageName;
	
	int LevelTest[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
			{1,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,2,5,5,5,5,5,5,5,5,3,5,5,5,5,5,3,5,1},
			{1,3,3,3,5,3,5,5,5,5,5,5,5,4,5,5,5,5,5,1},
			{1,5,4,5,5,3,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,5,5,5,5,5,5,5,5,5,5,5,4,5,5,5,5,5,1},
			{1,5,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,5,3,5,5,5,5,4,5,5,5,5,5,5,5,5,4,5,1},
			{1,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,5,5,5,5,5,5,5,5,5,3,5,5,5,5,5,5,5,1},
			{1,5,5,3,3,5,5,5,5,5,5,5,5,5,4,5,5,5,5,1}, 
			{1,5,5,5,4,5,5,5,5,5,4,5,5,5,5,5,5,5,5,1},
			{1,5,5,5,5,5,5,3,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,5,5,5,5,5,5,5,5,5,5,4,5,5,5,5,5,5,1},
			{1,5,3,5,5,5,5,4,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,5,5,5,5,5,3,5,5,5,5,5,5,5,3,5,5,5,1},
			{1,5,5,5,3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,5,5,5,5,5,5,5,5,5,5,5,3,5,5,5,5,5,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
	
	public void paintComponent(Graphics g) {
		try {
    			X = 0;
    			Y = 0;
    		
    		while(Y != 20) {
    		
    			while(X != 20) {
    				
    				switch (LevelTest[Y][X]) {
    					case 1 :
    						imageName = "Wall.png";
    					break;
    					
    					case 2 :
    						imageName = "Hero.png";
    					break;
    					
    					case 3 :
    						imageName = "Boulder.png";
    					break;
    					
    					case 4 :
    						imageName = "Diamond.png";
    					break;
    					
    					case 5 :
    						imageName = "Dirt.png";
    					break;
    					
    					default :
    						imageName = "Diamond.png";
    					break;
    				}
    				
    				Image img = ImageIO.read(new File(imageName));
    				g.drawImage(img, X*16, Y*16, this);

    				X++;
    				
    			}

    			Y++;
    			X = 0;
    		}
		} catch (IOException e){e.printStackTrace();}
	}
    	
      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this)
	
	public int getImageId(int X, int Y) {
		return Y;
		
	}
}