public class IDW {
	public static double calculate(double[][] data, int r, int c) {
		double above = 0;
		double below = 0;
		double weight=0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				double t = data[i][j];
				if (!Double.isNaN(t)) {
					if(i==r&&j==c)
						continue;
					double dis = Distance.dis(r, c, i, j);
					if (dis == 0) continue;                    
		            weight = 1.0 / (dis * dis);
		            above += weight * t;
		            below += weight;
				}
			}
		}
		if (below == 0) {
			return Double.NaN;
		} else {
			return above / below;
		}
	}
}