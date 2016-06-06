package sorts;


import java.util.Arrays;

/**
 * Quicksort, or partition-exchange sort, is a sorting algorithm developed by Tony Hoare that, on average,
 * makes O(n log n) comparisons to sort n items. In the worst case, it makes O(n2) comparisons, though this
 * behavior is rare. Quicksort is often faster in practice than other O(n log n) algorithms.[1]
 * Additionally, quicksort's sequential and localized memory references work well with a cache.
 * Quicksort is a comparison sort and, in efficient implementations, is not a stable sort.
 * <p/>
 * Quicksort can be implemented with an in-place partitioning algorithm,
 * so the entire sort can be done with only O(log n) additional space used by the stack during the recursion
 * <p/>
 * Quicksort takes O(n log n) time on average, when the input is a random permutation.
 * <p/>
 * Worst O(n^2)
 * <p/>
 * User: cristipopovici
 */
public class QuickSort {

    private static final int[] a = {3, 1, 2, 4};

    public static void main(String[] args) {
        quickSort(0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int low, int high) {
        int i = low, j = high;

        int pivot = a[low + (high - low) / 2];

        while (i <= j) {

            while (a[i] < pivot) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    private static void exchange(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
