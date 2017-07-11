package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

	/**
	 * JUnit test class for the entity objects.
	 * @author Matthis
	 *
	 */
public class EntityTest {

	private int X;
	
	/**
	 * Defines the entity coordinate in Y in the table.
	 */
	private int Y;
	
	/**
	 * Defines the entity type.
	 */
	private String Type;
	
	/**
	 * Defines the entity image path from source repertory.
	 */
	private String imagePath;
	
	/**
	 * Defines if the entity has moved yet in the last update of the map.
	 */
	private boolean HasMoved;
	
	
	public EntityTest(int X, int Y, String Type, String imagePath, boolean HasMoved)
	  {
	    System.out.println("Creation of the entity with parameters !");
	    this.X = X;
	    this.Y = Y;
	    this.Type = Type;
	    this.imagePath = imagePath;
	    this.HasMoved = HasMoved;
	  }
	
	
	/*
	public EntityTest()
	  {
	    System.out.println("Création d'une entité avec des paramètres !");
	    this.X = 999;
	    this.Y = 999;
	    this.Type = "Default";
	    this.imagePath = "Default";
	    this.HasMoved = false;
	  }*/
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		X = 1;
		Y = 1;
		Type = "Test";
		imagePath = "Test";
		HasMoved = false;
		
		
		
		
		EntityTest entityTest1 = new EntityTest(X, Y, Type, imagePath, HasMoved);
		System.out.println(entityTest1.X);
	}
	
}
