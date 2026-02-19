
public abstract class Entity{
	protected int x;
	protected int y;
	//initial position
	public Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }
	//entity has own movement
	public abstract void move(char direction, Map map) ;
	public int getX() {
        return x;
    }
	public int getY() {
        return y;
    }
}
