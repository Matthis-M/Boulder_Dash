package view;

import java.awt.Color;
import javax.swing.JFrame;
		
public class GameWindow extends JFrame {

	public GameWindow() {

		this.setTitle("The Amazing And Original Game Named Boulder Dash and Created Exclusively By Exia Students Named Simon, Vincent, Matthis And Matthieu That Is Not Inspired At All By A True Existing Game");
		this.setSize(1920, 1080);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
		
		GamePanel GameViewPanel = new GamePanel();
		
		GameViewPanel.setBackground(Color.BLACK);
		
		
		
		this.setContentPane(GameViewPanel);
		this.setVisible(true);
	}
}
