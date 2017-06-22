package model;

/**
 * <h1> This class contain the Level map and other information as the number of diamonds needed to end it. <h1>
 * 
 * @author Group
 * @version 0.1
 */

public abstract class Level {
	
	/**
	 * Map containing the objects of the game.
	 */
	private int MAP[][] ;
	
	/**
	 * Defines the number of diamonds needed to end the level.
	 */
	private int diamondsNeeded;
	
	/*
	 * A great part of the code contained in View and especially GamePanel should be placed here.
	 * However, as we didn't manage to make the connection between the packages through the interfaces,
	 * we had to directly place the MAP table in the View in order to make it works.
	 */
	
}
