import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Generator randomNumbersGenerator = new GeneratorImpl();
        int[][] twoDimensionalArray = new int[10][10];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = randomNumbersGenerator.generate();
            }
        }
        System.out.println(Arrays.deepToString(twoDimensionalArray));
        System.out.println(CustomMath.findMaxNumber(twoDimensionalArray));
        System.out.println(CustomMath.findMinNumber(twoDimensionalArray));
        System.out.println(CustomMath.findAverageNumber(twoDimensionalArray));
    }

}

