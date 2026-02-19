import java.util.Random;

public class Guard extends Entity{
	//give guard random position
	public Guard(int size) {
		super(0, 0);
        Random r=new Random();
        //random position get and it is in the map
        x=r.nextInt(size);
        y=r.nextInt(size);
	}
	@Override
	//no direction control
	public void move(char direction, Map map) {
		//random direction 0:up;1:down;2:left;3:right
		Random r=new Random();
		int newX=x;
        int newY=y;
        
        int dir=r.nextInt(4);
        //guard's new position
        if(dir==0) 
        	newY++;
        if(dir==1) 
        	newY--;
        if(dir==2) 
        	newX--;
        if(dir==3) 
        	newX++;
        //in the map && not in the wall
        if(newX>=0 && newY>=0 && newX<map.getSize() && newY<map.getSize() && !map.isWall(newX, newY)) {
        	x =newX;
            y =newY;
    
             }
        
	}

}
