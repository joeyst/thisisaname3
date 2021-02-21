package avoid;

public abstract class AbstractEnemy extends GameObject {

    private final int damage;
    private final int slow;

    public AbstractEnemy(int x, int y, ID id, int damage, int slow) {
        super(x, y, id);
        this.damage = damage;
        this.slow = slow;
        
    }

    public int getDamage() {
        return damage;
    }
    
    public float getSlow () {
    	return slow;
    }
    
    public void isSlow() {
    	// says whether the player is slow or not. will be boolean not void but it gets mad at me if i do boolean
    }

}