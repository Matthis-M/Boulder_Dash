package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Entity;
import model.Level;


/**   
 * <h1>This class inherits from JPanel and constitute the elements that will be displayed on the window.</h1>
 *
 * @author Matthis MOYON
 * @version 2.0
 */
 
public class GamePanel extends JPanel implements KeyListener {

	/**
	 * The ints X and Y in this class correspond to the coordinates of the elements in the table "MAP".
	 */
	private int X;
	private int Y;
	
	/**
	 * The string "imagePath" corresponds to the path of the chosen image.
	 */
	private String imagePath;
	//private String backgroundImg;
	

	/**
	 * The paintComponent method from JComponent is here specialized to load all the images as specified on the map.
	 * By using a loop, we browse the table in order to check the value in each box
	 * A "switch case" then modify the imageName attribute dependently on the value found
	 * to make the image match the type of object (1:Wall, 2:Hero, ...)
	 * The function g.drawimage then draw the matching image on the JPanel.
	 */
	public void paintComponent(Graphics g) {
		
		Entity viewMAP[][] = Level.getMAP();
		
		try {
			
			//For a background image
			//Image backgroundImg = ImageIO.read(new File("backgroundImg.png"));
		    //g.drawImage(backgroundImg, 0, 0, this.getWidth(), this.getHeight(), this);
			
    			X = 0;
    			Y = 0;
    		
    		while(Y != 20) {
    		
    			while(X != 20) {
    				
    				switch (viewMAP[Y][X].getType()) {

    					case "Wall" :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Wall.png";
    					break;
    					
    					case "Hero" :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Hero.png";
    					break;
    					
    					case "Boulder" :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Boulder.png";
    					break;
    					
    					case "Diamond" :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Diamond.png";
    					break;
    					
    					case "Dirt" :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Dirt.png";
    					break;
    					
    					case "Enemy1" :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Enemy1.png";
    					break;
    					
    					case "Enemy2" :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Enemy2.png";
    					break;
    					
    					case "Empty" :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Empty.png";
    					break;

    					
    					default :
    						imagePath = "D:/Scolaire/Exia.CESI/Projets/06 - Boulder Dash/Boulder_Dash/BoulderDash/BoulderDash/Error.png";
    					break;
    					
    				}

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
	 * Implementation of the KeyListener interface.
	 */
	@Override
	public void keyPressed(KeyEvent k) {
		int key = k.getKeyCode();
		//Order userOrder;

		switch (key) {
		
			case KeyEvent.VK_DOWN :
				
				//userOrder = (Order.DOWN);
				//GameController.heroMove(userOrder);
				//repaint();
				System.out.println("bas");
				break;
				
			case KeyEvent.VK_UP:

				//userOrder = (Order.UP);
				//GameController.heroMove(userOrder);
				//repaint();
				System.out.println("haut");
				break;
				
			case KeyEvent.VK_RIGHT:

				//userOrder = (Order.RIGHT);
				//GameController.heroMove(userOrder);
				//repaint();
				System.out.println("droite");
				break;
				
			case KeyEvent.VK_LEFT:
				
				//userOrder = (Order.LEFT);
				//GameController.heroMove(userOrder);
				//repaint();
				System.out.println("gauche");
				break;
				
			default:
				//userOrder = null;
			break;
			
			}
	}

	/**
	 * Implementation of the KeyListener interface.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	/**
	 * Implementation of the KeyListener interface.
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}