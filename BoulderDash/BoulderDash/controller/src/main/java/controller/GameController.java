

package controller;

import model.Entity;
import model.Level;
import view.Order;

/**
 * 
 * <h1>The controller class which handles the displacement of the entities.</h1>
 * 
 * @author Matthis MOYON
 * @version 2.0
 */

public class GameController {

	/**
	 * A copy of the Map contained in model used to different tests.
	 */
	private static Entity BrowsedMAP[][] = Level.getMAP();
	
	private static int X;
	private static int Y;
	
	/**
	 * A counter of the number of diamonds taken by the Hero.
	 */
	private static int diamondCounter = 0;
	
	/**
	 * A two-values table used to return the coordinates of an entity in various methods.
	 */
	private static int[] entityCoordinates = new int[2];
	
	public static boolean GameOver = false;
	
	/**
	 * A method used to return the position of the Hero in the map.
	 */
	public static int[] heroSelect() {

		resetXandY();

			while(Y != 20) {

				while(X != 20) {

					if(BrowsedMAP[Y][X].getType() == "Hero") {
							entityCoordinates[0] = Y;
							entityCoordinates[1] = X;
						}

					X++;
				}

				X=0;
				Y++;
			}

			return entityCoordinates;
	}
	
	/**
	 * A huge method used to manage the hero's movements.
	 * @parameter userOrder
	 * The order received from the KeyListening class.
	 */
	public static void heroMove(Order userOrder) {
		
		int heroX, heroY, checkX, checkY;
		heroX = heroY = checkX = checkY = 0;
		
		int[] heroCoordinates = heroSelect();
		
			heroY = heroCoordinates[0];
			heroX = heroCoordinates[1];
		
			
			switch (userOrder) {
			
				case UP :
					checkX = heroX;
					checkY = heroY - 1;
				break;
				
				case DOWN :
					checkX = heroX;
					checkY = heroY + 1;
				break;
					
				case RIGHT :
					checkX = heroX + 1;
					checkY = heroY;
				break;
					
				case LEFT :
					checkX = heroX - 1;
					checkY = heroY;
				break;
				
				default :
					System.out.println("ERROR");
				break;
			}
			
			
			switch (Level.checkMapObject(checkY, checkX)) {
			
				case "Wall" :
					System.out.println("not implemented yet");
				break;
				
				case "Boulder" :
					System.out.println("not implemented yet");
				break;
				
				case "Diamond" :
					moveEntity(heroY, heroX, checkY, checkX);
					diamondCounter++;
				break;
				
				case "Dirt" :
					moveEntity(heroY, heroX, checkY, checkX);
				break;
				
				case "Enemy1" :
					System.out.println("not implemented yet");
				break;
				
				case "Enemy2" :
					System.out.println("not implemented yet");
				break;
				
				default :
					System.out.println("ERROR");
				break;
			}
	}
	
	/**
	 * A method which manage the displacement of any entity in the model map.
	 * 
	 * @param actualPositionX
	 * The actual position in X of the entity
	 * 
	 * @param actualPositionY
	 * The actual position in X of the entity
	 * 
	 * @param newPositionX
	 * The wanted new position in X of the entity
	 * 
	 * @param newPositionY
	 * The wanted new position in X of the entity
	 */
	
	public static void moveEntity(int actualPositionX, int actualPositionY, int newPositionX, int newPositionY) {
		
		String tempoType;
		
		tempoType = Level.checkMapObject(actualPositionY, actualPositionX);
		Level.setMapEntityType(newPositionY, newPositionX, tempoType);
		Level.setMapEntityHasMoved(newPositionY, newPositionX, true);
		Level.setMapEntityType(actualPositionY, actualPositionX, "Empty");
	}
	
	/**
	 * A little method used to easily reset variables values.
	 */
	private static void resetXandY() {
		X = 0;
		Y = 0;
	}
}

