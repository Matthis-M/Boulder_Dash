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
	
	private String imageName;
	//private String backgroundImg;
	
	static int MAP[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
			{1,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
			{1,5,2,5,5,5,5,5,7,7,7,3,5,5,5,5,5,3,5,1},
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
			
			//For a background image
			//Image backgroundImg = ImageIO.read(new File("backgroundImg.png"));
		    //g.drawImage(backgroundImg, 0, 0, this.getWidth(), this.getHeight(), this);
			
			
    			X = 0;
    			Y = 0;
    		
    		while(Y != 20) {
    		
    			while(X != 20) {
    				
    				switch (MAP[Y][X]) {
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
    					
    					case 6 :
    						imageName = "Enemy1.png";
    					break;
    					
    					case 7 :
    						imageName = "EmptyBlock.png";
    					break;
    					
    					case 8 :
    						imageName = "Enemy2.png";
    					break;
    					
    					default :
    						imageName = "Error.png";
    					break;
    					
    				}
    				
    				//if(imageName != "Empty") {
    				Image img = ImageIO.read(new File(imageName));
    				g.drawImage(img, X*16, Y*16, this);//}

    				X++;
    				
    			}

    			Y++;
    			X = 0;
    		}
		} catch (IOException e){e.printStackTrace();}
		
		
	}
	
	public static int checkObject(int X, int Y) {
		return MAP[X][Y];
		
	}
}