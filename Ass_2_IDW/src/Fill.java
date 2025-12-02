public class Fill {
    public static double[][] fill(double[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        double[][] ans = new double[r][c];
        for (int i = 0; i < r; i++) {
            System.arraycopy(matrix[i], 0, ans[i], 0, c);
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
            	if (Double.isNaN(matrix[i][j])) {
            	    ans[i][j] = IDW.calculate(matrix, i, j); 
            	} else {
            	    ans[i][j] = matrix[i][j]; 
            	}
            }
        }
        return ans;
    }
}