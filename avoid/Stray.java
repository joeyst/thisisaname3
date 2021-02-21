package avoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Stray extends AbstractEnemy {

    private Color lightBlue = new Color(43, 241, 255);
	private Handler handler;
    private static final int DAMAGE = 0;
    final static int SLOW = 35;
    
    public Stray(int x, int y, ID id, Handler handler) {
        super(x, y, id, DAMAGE, SLOW);
        
        this.handler = handler;
        
        velX = 3;
        velY = 3;

    }
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 8, 8);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 56)velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32)velX *= -1;
		
		handler.addObject(new Trail(x, y, ID.Trail, lightBlue, 20, 20, 0.1f, handler));
		
	}


	public void render(Graphics g) {
		g.setColor(lightBlue);
		g.fillRect(x, y, 8, 8);
		
	}

}
