package sorts;

import java.util.Arrays;

/**
 * Insertion Sort
 * <p/>
 * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
 * However, insertion sort provides several advantages:
 * <p/>
 * Simple implementation
 * <p/>
 * Efficient for (quite) small data sets
 * <p/>
 * Adaptive (i.e., efficient) for data sets that are already substantially sorted: the time complexity is O(n + d),
 * where d is the number of inversions
 * <p/>
 * More efficient in practice than most other simple quadratic (i.e., O(n2)) algorithms such as
 * selection sort or bubble sort; the best case (nearly sorted input) is O(n)
 * <p/>
 * Stable; i.e., does not change the relative order of elements with equal keys
 * <p/>
 * In-place; i.e., only requires a constant amount O(1) of additional memory space
 * <p/>
 * Online; i.e., can sort a list as it receives it
 * <p/>
 * <p/>
 * User: cristipopovici
 * <p/>
 */
public class InsertionSort1 {

    private static final int[] arr = {2, 1, 5, 3, 7, 6, 4};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {

            int item = arr[i];

            for (int j = i - 1; j >= 0; j--) {
                if (item < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = item;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
