package sorting;

import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[100];

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int[] insertionSort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
        return arr;
    }

}
