public class IDW {
	public static double calculate(double[][] data, int r, int c) {
		double above=0;
		double below=0;
		double weight=0;
		for (int i=0;  i<data.length;i++) {
			for (int j=0;j<data[0].length;j++) {
				// Current value
				double t=data[i][j];
				// only use values that are not NaN
				if (!Double.isNaN(t)) {
					//skip the target position 
					if(i==r&&j==c)
						continue;
					//calculate the distance
					double dis=Distance.dis(r, c, i, j);
					// avoid zero
					if (dis==0) continue;  
					// IDW 
		            weight=1.0 / (dis * dis);
		            // add weighted value
		            above+=weight * t;
		            //+weight
		            below+=weight;
				}
			}
		}
		//if haven't found invalid neighbors 
		if (below==0) {
			return Double.NaN;
		} else {
			return above/below;
		}
	}
}