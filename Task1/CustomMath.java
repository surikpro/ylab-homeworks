import java.util.Arrays;

// Customized Math class for Math operations
public class CustomMath {

    public static int findMaxNumber(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
    public static int findMinNumber(int[][] array) {
        int minValue = Integer.MAX_VALUE;
        for (int[] ints : array) {
            for (int someInt : ints) {
                if (someInt < minValue) {
                    minValue = someInt;
                }
            }
        }
        return minValue;
    }
    public static int findAverageNumber(int[][] array) {
        // if we need more precise number (for example 50.6 -> 51) we can use Math.round() method
       return (int) Arrays.stream(array).flatMapToInt(Arrays::stream).average().getAsDouble();
    }
}
