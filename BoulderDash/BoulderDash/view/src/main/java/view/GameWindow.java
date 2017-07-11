package view;

import java.awt.Color;
import javax.swing.JFrame;


/**
 * <h1>This class is inherited from JFrame and configures the parameters of the window.</h1>
 *
 * @author Matthis MOYON
 * @version 2.0
 */



/**
 * There are the different actions of the method :
 * - Specifies the operation that make the window close. Here it's the right-top exit button.
 * - Instantiates a new JPanel object named "GameViewPanel".
 * - Add the KeyListener class.
 * - Makes the window visible.
 */
public class GameWindow extends JFrame {

	public GameWindow() {

		this.setTitle("The Amazing And Original Game Named Boulder Dash and Created Exclusively By Exia Students Named Simon, Vincent, Matthis And Matthieu That Is Not Inspired At All By A True Existing Game");
		this.setSize(340,370);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		

	
		GamePanel GameViewPanel = new GamePanel();
		
		this.addKeyListener(GameViewPanel);
		
		this.setContentPane(GameViewPanel);
		this.setVisible(true);
	}
}
