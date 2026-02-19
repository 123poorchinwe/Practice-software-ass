

public class Player extends Entity{
	private int energy;
	//player's position + energy
    public Player(int energy) {
        super(0, 0);
        this.energy=energy;
    }
	 //move the player,every step -1 energy
    @Override
	public void move(char direction, Map map) {
    	int newX=x;
        int newY=y;
        //new position
        if(direction == 'W') 
        	newY++;
        if(direction == 'S') 
        	newY--;
        if(direction == 'A') 
        	newX--;
        if(direction == 'D') 
        	newX++;
        //check the boundary of the map
        if(newX<0 || newY<0 || newX>=map.getSize() || newY>=map.getSize()) {
        	System.out.println("Leave the map!!!");
	        return;     
    }
        //check the wall
        if(map.isWall(newX, newY)) {
            System.out.println("You hit a wall!");
            return;
        }
        //update position and energy
        if(direction == 'W') 
        	moveUp();
        if(direction == 'S') 
        	moveDown();
        if(direction == 'A') 
        	moveLeft();
        if(direction == 'D') 
        	moveRight();
        if(map.hasTreasure(x, y)) {
            System.out.println("Treasure, here!!");
            map.removeTreasure(x, y);
        }
    }
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
	public int getEnergy() {
        return energy;
    }
       

}

