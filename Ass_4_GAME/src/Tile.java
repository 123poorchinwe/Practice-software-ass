
public class Tile {
	private boolean isWall;
    private boolean isExit;
    //initial the tile (wall /exit)
    public Tile(boolean isWall, boolean isExit) {
        this.isWall=isWall;
        this.isExit=isExit;
    }
    //wall-true
    public boolean isWall() {
        return isWall;
    }
    //exit-true
    public boolean isExit() {
        return isExit;
    }
}
