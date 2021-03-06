package IndieGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;


public class GenericGame extends AbstractGame implements GameContext{

	
	public GenericGame(){
	super();
	Random r = new Random();
	
   }
	
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		for(Sprite s:this.lista){
			s.update();
		}
	}

	@Override
	public void gameRender() {
		// TODO Auto-generated method stub
    	Graphics2D g=(Graphics2D) buffer.getGraphics();
    	/*g.setColor(Color.WHITE);
    	g.fillRect(0, 0, Whidt,Height);
    	*/
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, GenericGame.Width,GenericGame.Height);
    	
    	for(Sprite s:this.lista){
			s.draw(g);
		}
    	
    	reportarEstadisticas(g);
    	
	}



	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return GenericGame.Height;
	}

	@Override
	public int getPlayerDirection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[][] getPlayerPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSecondsElapsed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWhidth() {
		// TODO Auto-generated method stub
		return GenericGame.Width;
	}

	@Override
	public boolean keyState(Object player, Object button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean colisiono(Sprite s) {
		// TODO Auto-generated method stub
	//	for(int i=0;i<)
		boolean result= false;
		for(int i=0;i<lista.size()&&!result;i++){
			Sprite saux= lista.get(i);
			if(!saux.equals(s)){
				result=	saux.getShape().intersects(s.getShape().getBounds2D());
			}
		}
		return result;
	}

	@Override
	public void paintScreen() {
		// TODO Auto-generated method stub
		
	    	Graphics2D g=(Graphics2D) getGraphics();
	    	g.drawImage(buffer,0,0,this);
	    
		
	}

}
