package model;

import model.dao.EntityDAO;

/**
 * <h1> This class contain the Level map and other information as the number of diamonds needed to end it. <h1>
 * 
 * @author Group
 * @version 2.0
 */


public class Level {
	
	/**
	 * Map containing the objects of the game.
	 */
	private static Entity[][]MAP = new Entity[20][20];
	
	private static String EntityType;
	
	private static int X = 0;
	private static int Y = 0;
	
	
	/**
	 * The createMAP method build the entities map from the descriptive int map retrieved from the database.
	 */
	public static void createMAP() {
		
		while(Y<20) {
		
			while(X<20) {
				
				switch (EntityDAO.checkIntDBMap(Y, X)) {
					
					case 1 :
						EntityType = "Wall";
					break;
					
					case 2 :
						EntityType = "Hero";
					break;
					
					case 3 :
						EntityType = "Boulder";
					break;
					
					case 4 :
						EntityType = "Diamond";
					break;
					
					case 5 :
						EntityType = "Dirt";
					break;
					
					case 6 :
						EntityType = "Enemy1";
					break;
					
					case 7 :
						EntityType = "Empty";
					break;
					
					case 8 :
						EntityType = "Enemy2";
					break;
					
				
					default :
						EntityType = "Error";
					break;
				}
				
				MAP[X][Y] = new Entity(EntityType);
			
				X++;
			}
			X=0;
			Y++;
		}
	}
	
	/**
	 * Defines the number of diamonds needed to end the level.
	 */
	private int diamondsNeeded;
	
	
	/**
	 * Getter of the MAP.
	 * @return MAP
	 */
	public static Entity[][] getMAP() {
		return MAP;
	}
	
	/**
	 * Setter of the MAP
	 * @param NewMap
	 */
	public static void setMAP(Entity[][] NewMap) {
		MAP = NewMap;
	}
	
	/**
	 * Method used to check the type of object at a precise location.
	 * @param Y
	 * @param X
	 * @return The type of the object.
	 */
	public static String checkMapObject(int Y, int X) {
		return MAP[Y][X].getType();
	}
	
	/**
	 * Method used to modify the type of an object in the MAP.
	 * @param Y
	 * @param X
	 * @param The new type
	 */
	public static void setMapEntityType(int Y, int X, String Type) {
		MAP[Y][X].setType(Type);
	}
	
	/**
	 * Setter of the HasMoved parameter of an entity in the MAP.
	 * @param Y
	 * @param X
	 * @param HasMoved
	 */
	public static void setMapEntityHasMoved(int Y, int X, boolean HasMoved) {
		MAP[Y][X].setHasMoved(HasMoved);
	}
	
}