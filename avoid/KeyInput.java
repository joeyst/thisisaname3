package avoid;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	public static int inputV = 5;
		 
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.gameObjects.size(); i++) {
			GameObject tempObject = handler.gameObjects.get(i);
			
			if(tempObject.getId() == ID.Player) {
				//key events for player 1
				
				if(key == KeyEvent.VK_W) tempObject.setVelY(-1 * inputV);
				if(key == KeyEvent.VK_S) tempObject.setVelY(inputV);
				if(key == KeyEvent.VK_D) tempObject.setVelX(inputV);
				if(key == KeyEvent.VK_A) tempObject.setVelX(-1 * inputV);
			}
			/*if(tempObject.getId() == ID.Player2) {
				//key events for player 2
				
				if(key == KeyEvent.VK_UP) tempObject.setVelY(-5);
				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(5);
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(5);
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(-5);
			}*/
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.gameObjects.size(); i++) {
			GameObject tempObject = handler.gameObjects.get(i);
			
			if(tempObject.getId() == ID.Player) {
				//key events for player 1
				
				if(key == KeyEvent.VK_W) tempObject.setVelY(0);
				if(key == KeyEvent.VK_S) tempObject.setVelY(0);
				if(key == KeyEvent.VK_D) tempObject.setVelX(0);
				if(key == KeyEvent.VK_A) tempObject.setVelX(0);
			}
			/*if(tempObject.getId() == ID.Player2) {
				//key events for player 2
				
				if(key == KeyEvent.VK_UP) tempObject.setVelY(0);
				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(0);
				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(0);
				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(0);
			}*/
		}
		
		if(key == KeyEvent.VK_ESCAPE)System.exit(1);
		
	}

}
