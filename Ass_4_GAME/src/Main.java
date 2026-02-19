import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// maze size 8x8
		Maze maze=new Maze(8);
        Player player= new Player(12);
        //initial energy 12
        boolean gameOver =false;
        while (!gameOver) {
        	//player position
            System.out.println("Player position:("+player.getX()+", "+player.getY()+")");
            System.out.println("Energy:"+player.getEnergy());
            System.out.print("Move(W/A/S/D/Q):");
            String input= s.nextLine().toUpperCase();
            //new position
            int newX=player.getX();
            int newY=player.getY();
            if(input.equals("W")) newY++;
            else if(input.equals("S")) newY--;
            else if(input.equals("A")) newX--;
            else if(input.equals("D")) newX++;
            else {
                System.out.println("Wrong!Wrong!Wrong!!!!Be careful!just 'W/A/S/D'");
                continue;
            }
            //if the player want to leave the maze
            if (newX<0||newY<0 ||newX>=maze.getSize()||newY>=maze.getSize()) {
                System.out.println("Leave the maze!!!");
                continue;
            }
            // the target tile
            Tile target=maze.getTile(newX, newY);
            // if the target tile is a wall
            if(target.isWall()) {
                System.out.println("You  hit a wall!");
                continue;
            }
            if(input.equals("W"))  
            	player.moveUp();
            if(input.equals("S"))  
            	player.moveDown();
            if(input.equals("A"))  
            	player.moveLeft();
            if(input.equals("D"))  
            	player.moveRight();
            //if the player reached the exit
            if(target.isExit()) {
                System.out.println("You escaped the maze!");
                gameOver = true;
            }
            //if the energy left
            if(player.getEnergy()<=0) {
                System.out.println("No energy left!!");
                gameOver = true;
         }
        }
        s.close();
    }
		
	

}
