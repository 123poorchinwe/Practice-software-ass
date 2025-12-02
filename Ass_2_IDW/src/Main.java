
public class Main {
    public static double[][] idw(double[][] data) {
        return Fill.fill(data);
    }

    public static void main(String[] matrix) {
        double[][] exampleInput = {
                {1.0, Double.NaN, 3.0},
                {Double.NaN, Double.NaN, 2.0},
                {4.0, 5.0, Double.NaN}
        };
        double[][] output = idw(exampleInput);

        System.out.println(output[0][0] + "  " + output[0][1] + "  " + output[0][2]);
        System.out.println(output[1][0] + "  " + output[1][1] + "  " + output[1][2]);
        System.out.println(output[2][0] + "  " + output[2][1] + "  " + output[2][2]);
        }
        
}