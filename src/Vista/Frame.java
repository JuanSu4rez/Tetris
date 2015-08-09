package Vista;

import javax.swing.JFrame;

import IndieGame.AbstractGame;
import IndieGame.GenericGame;

public class Frame extends JFrame {

	public final static int ALTO_FRAME = 1000;
	public final static int ANCHO_FRAME = 600;
	
	private AbstractGame abstractGame;
	
	public Frame(){
		
		abstractGame = new GenericGame();
		
		add(abstractGame);
		
		
		
	}
	
}
