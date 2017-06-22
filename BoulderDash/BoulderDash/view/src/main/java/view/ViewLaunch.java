package view;

/**
 * <h1>This class instantiate the game window with JFrame.</h1>
 *
 * @author Matthis MOYON
 * @version 1.0
 */

public class ViewLaunch {

	public static void main(String[] args) {

		/**
		 * Instantiation of the object "gameWindow", a Gamewindow object.
		 * 
		 * @param none.
		 * @return open the window.
		 */
		GameWindow gameWindow = new GameWindow();
		
		/**
		 * An example of the method "checkObject()", from the GamePanel class.
		 */
		System.out.println(GamePanel.checkObject(6,5));
	}

}
