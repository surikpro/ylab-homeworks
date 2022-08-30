// Utility class for dealing with arrays
public class NumbersUtilImpl implements NumbersUtil {
    private static int[] array;

    @Override
    public int[] quickSortAsc(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        array = arr;
        quickSort(0, array.length - 1);
        return array;
    }

    private static void quickSort(int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left + (right - left) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapValues(i, j);
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(left, j);
        if (i < right)
            quickSort(i, right);
    }

    private static void swapValues(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
