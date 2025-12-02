public class Distance {
    
    public static double dis(int r1, int c1, int r2, int c2) {
        int dr = r1 - r2;
        int dc = c1 - c2;
        return Math.sqrt(dr * dr + dc * dc);
    }
}