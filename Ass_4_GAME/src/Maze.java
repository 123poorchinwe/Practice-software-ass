import java.util.Random;

public class Maze {
	private Tile[][] grid;
    private int size;
    public Maze(int size) {
        this.size=size;
        grid=new Tile[size][size];
        Random r=new Random();
        //// Initialize all tiles as empty
        for(int x=0; x<size; x++) {
            for(int y=0; y<size; y++) {
                grid[x][y]=new Tile(false, false);
            }
}
        //The position of the wall
        for(int i=0; i<size; i++) {
            int wx= r.nextInt(size);
            int wy= r.nextInt(size);
            if (!((wx==0&&wy==0)||(wx==1&&wy==0)||(wx==0&&wy==1))) {
                grid[wx][wy]=new Tile(true, false);
            }
        }
         //The position of the exit
        int ex=r.nextInt(size);
        int ey=r.nextInt(size);
        while(ex==0&&ey== 0) {
            ex=r.nextInt(size);
            ey=r.nextInt(size);
        }
        grid[ex][ey] = new Tile(false, true);
     }
    
    public Tile getTile(int x, int y) {
        return grid[x][y];
    }

    public int getSize() {
        return size;
    }
    }

