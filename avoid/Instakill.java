package avoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Instakill extends AbstractEnemy{
	
	private Color myDarkGray = new Color(150, 150, 150);
	private Handler handler;
    private static final int DAMAGE = 1000;
    private static final int SLOW = 0;
    
    public Instakill(int x, int y, ID id, Handler handler) {
        super(x, y, id, DAMAGE, SLOW);
        
        this.handler = handler;
        
        velX = 1;
        velY = 1;

    }
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 100, 100);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 56)velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32)velX *= -1;
		
		handler.addObject(new Trail(x, y, ID.Trail, myDarkGray, 100, 100, 0.1f, handler));
		
	}


	public void render(Graphics g) {
		g.setColor(myDarkGray);
		g.fillRect(x, y, 100, 100);
		
	}

}
