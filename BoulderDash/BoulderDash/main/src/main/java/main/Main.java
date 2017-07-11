package main;

import java.sql.SQLException;

import controller.GameController;
import model.Level;
import model.dao.EntityDAO;
import view.GameWindow;
//import controller.GameController;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Matthis MOYON
 * @version 2.0
 */

public abstract class Main {
	
	private static int chosenLevel = 5;

	
    /**
     * The main method.
     *
     * @param args
     * the arguments
     * @throws SQLException 
     */
    public static void main(final String[] args) throws SQLException {
    	
    	EntityDAO.GenerateDBMap(chosenLevel);
    	Level.createMAP();
    	GameWindow gameWindow = new GameWindow();
    	GameController.gameLoop();
    }
}





