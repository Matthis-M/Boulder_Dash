

package controller;

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
	
	private static int TIME_SLEEP = 30;
	
	
	/**
	 * A counter of the number of diamonds taken by the Hero.
	 */
	private static int diamondCounter = 10;
	
	/**
	 * A two-values table used to return the coordinates of an entity in various methods.
	 */
	
	public static boolean GameOver = false;
	
	/**
	 * A method used to return the position of the Hero in the map.
	 */
	public static int[] heroSelect() {

		int x = 0;
		int y = 0;
		
		int[] entityCoordinates = new int[2];

			while(y != 20) {

				while(x != 20) {

					if(Level.checkMapObject(y,x) == "Hero") {
							entityCoordinates[0] = y;
							entityCoordinates[1] = x;
						}

					x++;
				}

				x=0;
				y++;
			}

			//System.out.println(entityCoordinates[0]);
			//System.out.println(entityCoordinates[1]);
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
					System.out.println("\nWhat do you expect ? Do you really think that you can dig through this wall !?\n");
				break;
				
				case "Boulder" :
					int a = 0, nextEntityX;
					
					if(userOrder == Order.RIGHT) {
						a = 1;
					}
					
					else if (userOrder == Order.LEFT) {
						a = -1;
					} else {System.out.println("The boulder is blocked.");}
					
					nextEntityX = checkX + a;
					
					if (Level.checkMapObject(checkY, nextEntityX) == "Empty") {
						moveEntity(checkY, checkX, checkY, nextEntityX);
						moveEntity(heroY, heroX, checkY, checkX);
					}
					
				break;
				
				case "Diamond" :
					moveEntity(heroY, heroX, checkY, checkX);
					diamondCounter--;
					if(diamondCounter == 0) {
						System.out.println("\n\n\n------------------- YOU WON !!! -------------------\n\n\n");
						System.exit(0);
					}
					System.out.print("\n\nOnly " + (diamondCounter) + " diamonds left to win\n\n");
					
				break;
				
				case "Dirt" : case "Empty" :
					moveEntity(heroY, heroX, checkY, checkX);
				break;
				
				case "Enemy1" : case "Enemy2" :
					System.out.println("\n\n\n------------------- YOU DIED !!! -------------------\n\n\n");
					System.exit(0);
				break;
				
				default:
					System.out.println("\nYou can't go that way.\n");
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
	
	public static void moveEntity(int actualPositionY, int actualPositionX, int newPositionY, int newPositionX) {
		
		String tempoType;
		
		tempoType = Level.checkMapObject(actualPositionY, actualPositionX);
		//System.out.println(tempoType);
		Level.setMapEntityType(newPositionY, newPositionX, tempoType);
		Level.setMapEntityHasMoved(newPositionY, newPositionX, true);
		Level.setMapEntityType(actualPositionY, actualPositionX, "Empty");
	}
	
	
	/**
	 * Method used to update the map at regular intervals (to make the boulders fall for example)
	 */
	public static void gameLoop() {
		while (GameOver != true) {
			try {
				Thread.sleep(TIME_SLEEP);
				Level.updateMap();
				
			} catch (final InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			
		}
	}
}
