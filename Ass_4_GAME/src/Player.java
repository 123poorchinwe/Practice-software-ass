
public class Player {
	private int x;
	private int y;
	private int energy;
	public Player(int energy) {
		this.x=0;
		this.y=0;
		this.energy=energy;
	}
	
	 //move the player,every step -1 energy
	public void moveLeft() {
        x--;
        energy--;
    }
	public void moveRight() {
        x++;
        energy--;
    }
	public void moveUp() {
        y++;
        energy--;
    }
	public void moveDown() {
        y--;
        energy--;
    }
	public int getX() {
        return x;
    }
	public int getY() {
        return y;
    }
	public int getEnergy() {
        return energy;
    }

}
