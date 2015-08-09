package Vista;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public final static int ALTO_FRAME = 1000;
	public final static int ANCHO_FRAME = 600;
	
	private AbstractGame abstractGame;
	
	public Frame(){
		
		abstractGame = new GenericGame();
		
		add(abstractGame);
		
		
		
	}
	
}
