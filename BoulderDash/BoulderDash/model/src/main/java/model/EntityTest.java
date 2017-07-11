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
	
	public EntityTest()
	  {
	    System.out.println("Création d'une entité avec des paramètres !");
	    this.X = 999;
	    this.Y = 999;
	    this.Type = "Test";
	    this.imagePath = "Test.png";
	    this.HasMoved = false;
	  }
	
	
	
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
				
		EntityTest entityTest1 = new EntityTest();
		System.out.println(entityTest1.X);
		System.out.println(entityTest1.Y);
		System.out.println(entityTest1.Type);
		System.out.println(entityTest1.imagePath);
		System.out.println(entityTest1.HasMoved);
	}
	
}
