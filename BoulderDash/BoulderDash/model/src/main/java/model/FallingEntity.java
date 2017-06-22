package model;

/**
 * <h1> This is an abstract class from which inherit the entities that can fall (boulders and diamonds). <h1>
 * 
 * @author Group
 * @version 0.1
 */

public abstract class FallingEntity extends Entity{

	/**
	 * Makes the entity move down if there's nothing beside it.
	 */
	public void gravity() {
		
	}
	
	/**
	 * Makes the entity destroy the entity beside if it's an enemy or the Hero.
	 */
	public void crush() {
		
	}
}
