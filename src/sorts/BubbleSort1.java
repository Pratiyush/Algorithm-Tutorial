package sorts;


import java.util.Arrays;

/**
 * Bubble sort, sometimes incorrectly referred to as sinking sort, is a simple sorting algorithm that works by
 * repeatedly stepping through the list to be sorted, comparing each pair of adjacent items and swapping them
 * if they are in the wrong order. The pass through the list is repeated until no swaps are needed,
 * which indicates that the list is sorted.
 * <p/>
 * The algorithm gets its name from the way smaller elements "bubble" to the top of the list.
 * Because it only uses comparisons to operate on elements, it is a comparison sort.
 * Although the algorithm is simple, most of the other sorting algorithms are more efficient for large lists.
 * <p/>
 * Bubble sort has worst-case and average complexity both О(n2), where n is the number of items being sorted.
 * There exist many sorting algorithms with substantially better worst-case or average complexity of O(n log n).
 * Even other О(n2) sorting algorithms, such as insertion sort, tend to have better performance than bubble sort.
 * Therefore, bubble sort is not a practical sorting algorithm when n is large.
 * <p/>
 * User: cristipopovici
 */
public class BubbleSort1 {

    public static void main(String[] args) {
        int[] a = new int[]{3, 1, 5, 3, 8, 7, 9};

        int arrSize = a.length;

        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }

}
