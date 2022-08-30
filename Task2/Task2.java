import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arrayToSort = {5,6,3,2,5,1,4,9};
        NumbersUtil util = new NumbersUtilImpl();
        System.out.println(Arrays.toString(util.quickSortAsc(arrayToSort)));
    }
}
