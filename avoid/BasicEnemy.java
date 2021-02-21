package avoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BasicEnemy extends AbstractEnemy{

    private Handler handler;
    private static final int DAMAGE = 2;
    private static final int SLOW = 0;
    
    public BasicEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id, DAMAGE, SLOW);
        
        this.handler = handler;
        
        velX = 5;
        velY = 5;

    }
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 56)velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32)velX *= -1;
		
		handler.addObject(new Trail(x, y, ID.Trail, Color.red, 16, 16, 0.1f, handler));
		
	}


	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);
		
	}

}
