package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Level;
import model.dao.EntityDAO;

public class GameControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		EntityDAO.GenerateDBMap(1);
    	Level.createMAP();
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
			System.out.println("Hero position in X : " + entityCoordinates[1]);
			System.out.println("Hero position in Y : " + entityCoordinates[0]);
		}
}
