package avoid;

import java.util.Random;

public class Spawn {
	
	Random rand = new Random();
	
	private Handler handler;
	private HUD hud;
	
	private int scoreKeep = 0;
	private int runnerLevel = 1;
	private int speedLevel = 1;
	private int deathLevel = 1;
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
		
	}
	
	public void tick() {
		scoreKeep++;
		
		// will be set to 250, 50 for testing
		if(scoreKeep >= 50) {
			scoreKeep = 0;
			int x = rand.nextInt(640);
			int y = rand.nextInt(480);
			hud.setLevel(hud.getLevel() + 1);
			handler.addObject(new BasicEnemy(x, y, ID.BasicEnemy, handler));
			runnerLevel = runnerLevel + 1;
			speedLevel = speedLevel + 1;
			deathLevel = deathLevel + 1;
			
		if(runnerLevel == 5) {
			int a = rand.nextInt(640);
			int b = rand.nextInt(480);
			handler.addObject(new FastEnemy(a, b, ID.FastEnemy, handler));
			runnerLevel = runnerLevel - 5;
			
		if(speedLevel == 10) {
			int c = rand.nextInt(640);
			int d = rand.nextInt(480);
			handler.addObject(new Stray(c, d, ID.Stray, handler));
			speedLevel = speedLevel - 10;
		if(deathLevel == 20) {
			int e = rand.nextInt(640);
			int f = rand.nextInt(480);
			handler.addObject(new Instakill(e, f, ID.Instakill, handler));
			deathLevel = deathLevel - 20;
		}
		
		}
		
		}
			
			/*if(hud.getLevel() == 2) {
				handler.addObject(new BasicEnemy(0, 0, ID.BasicEnemy, handler));*/
			}
		}
	}

