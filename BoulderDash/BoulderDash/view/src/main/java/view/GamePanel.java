package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * <h1>This class inherits from JPanel and constitute the elements that will be displayed on the window.</h1>
 *
 * @author Matthis MOYON
 * @version 1.0
 */
 
public class GamePanel extends JPanel {
	
	
	/**
	 * The ints X and Y in this class correspond to the coordinates of the elements in the table "MAP".
	 */
	private int X;
	private int Y;
	
	/**
	 * The string "imagePath" corresponds to the path of the choosen image.
	 */
	private String imagePath;
	//private String backgroundImg;
	
	/**
	 * This table is used to describe the components of the level. Each int is a type of object (Boulder, Dirt, Hero, ...).
	 */
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
	

	/**
	 * The paintComponent method from JComponent is here specialized to load all the images as specified on the map.
	 * By using a loop, we browse the table in order to check the value in each box
	 * A "switch case" then modify the imageName attribute dependently on the value found
	 * to make the image match the type of object (1:Wall, 2:Hero, ...)
	 * The function g.drawimage then draw the matching image on the JPanel.
	 */
	public void paintComponent(Graphics g) {
		try {
			
			//For a background image
			//Image backgroundImg = ImageIO.read(new File("backgroundImg.png"));
		    //g.drawImage(backgroundImg, 0, 0, this.getWidth(), this.getHeight(), this);
			
			/**
			 * The two loops "while()" are here used to browse all the table.
			 */
			
    			X = 0;
    			Y = 0;
    		
    		while(Y != 20) {
    		
    			while(X != 20) {
    				
    				switch (MAP[Y][X]) {
    				
    				/**
    				 * The "switch case" is here used to modify the imagePath attribute depending of the type of object.
    				 */
    					case 1 :
    						imagePath = "Wall.png";
    					break;
    					
    					case 2 :
    						imagePath = "Hero.png";
    					break;
    					
    					case 3 :
    						imagePath = "Boulder.png";
    					break;
    					
    					case 4 :
    						imagePath = "Diamond.png";
    					break;
    					
    					case 5 :
    						imagePath = "Dirt.png";
    					break;
    					
    					case 6 :
    						imagePath = "Enemy1.png";
    					break;
    					
    					case 7 :
    						imagePath = "EmptyBlock.png";
    					break;
    					
    					case 8 :
    						imagePath = "Enemy2.png";
    					break;
    					
    					default :
    						imagePath = "Error.png";
    					break;
    					
    				}
    				
    				/**
    				 * The two following methods are used to load the element depending of its path
    				 * and draw it on the panel depending of its coordinates in the table. 
    				 */
    				Image img = ImageIO.read(new File(imagePath));
    				g.drawImage(img, X*16, Y*16, this);

    				X++;
    				
    			}

    			Y++;
    			X = 0;
    		}
		} catch (IOException e){e.printStackTrace();}
	}
	
	/**
	 * Static method used to check the type of object placed at X and Y positions.
	 * 
	 * @param X is one coordinate of the object to check the type.
	 * @param Y is the other coordinate of the object to check the type.
	 * 
	 * @return Return the type of the object.
	 */
	public static int checkObject(int X, int Y) {
		return MAP[X][Y];
	}
}