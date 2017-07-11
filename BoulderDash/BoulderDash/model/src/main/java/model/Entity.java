package model;

/**
 * <h1> The Entity class. <h1>
 * 
 * @author Matthis MOYON
 * @version 2.0
 */

public class Entity {

	/**
	 * Defines the entity type (Boulder, Dirt, ...).
	 */
	private String Type;
	
	/**
	 * Defines if the entity has moved yet in the last update of the map.
	 */
	private boolean HasMoved;
	
	/**
	 * Constructor of the entity.
	 * @param entityType
	 */
	public Entity(String entityType)
	{
		Type = entityType;
		HasMoved = false;
	}
	
		  
	/**
	 * Getter of entity attribute "HasMoved"
	 */
	public boolean getHasMoved() {
		return this.HasMoved;
	}
	
	/**
	 * Setter of entity attribute "HasMoved"
	 */
	public void setHasMoved(boolean newHasMoved) {
		this.HasMoved = newHasMoved;
	}
	
	/**
	 * Getter of entity attribute "Type"
	 */
	public String getType() {
		return this.Type;
	}
	
	/**
	 * Setter of entity attribute "Type"
	 */
	public void setType(String newType) {
		this.Type = newType;
	}
}