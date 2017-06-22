package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * <h1> This class was made to test the function of browsing the table and matching the ints with the different entities. <h1>
 * 
 * 
 * @author Matthis
 * @version 0.1
 */

public class GamePanelTest {

	private int X;
	private int Y;
	private String entityName;
	
	 int tab[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 
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
		 		{1,5,5,1,2,3,4,5,6,7,8,19,4,5,5,5,5,5,5,1},
		 		{1,5,3,5,5,5,5,4,5,5,5,5,5,5,5,5,5,5,5,1},
		 		{1,5,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
		 		{1,5,5,5,5,5,5,3,5,5,5,5,5,5,5,3,5,5,5,1},
		 		{1,5,5,5,3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,1},
		 		{1,5,5,5,5,5,5,5,5,5,5,5,5,3,5,5,5,5,5,1},
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
	
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
				
	    X = 0;
	    Y = 0;
	    		
	    while(Y != 20) {
	    		
	    	while(X != 20) {
	    				
	    		switch (tab[Y][X]) {
	    				
	    					case 1 :
	    						entityName = "Wall";
	    					break;
	    					case 2 :
	    						entityName = "Hero";
	    					break;
	    					case 3 :
	    						entityName = "Boulder";
	    					break;
	    					case 4 :
	    						entityName = "Diamond";
	    					break;
	    					case 5 :
	    						entityName = "Dirt";
	    					break;
	    					case 6 :
	    						entityName = "Enemy1";
	    					break;
	    					case 7 :
	    						entityName = "EmptyBlock";
	    					break;
	    					case 8 :
	    						entityName = "Enemy2";
	    					break;
	    					default :
	    						entityName = "Error";
	    					break;
	    				}
	    				System.out.println(entityName);
	    				
	    				X++;
	    				
	    			}

	    		Y++;
	    		X = 0;
	    	}
		}
	}

