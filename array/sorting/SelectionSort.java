package sorting;

import java.util.Scanner;

public interface SelectionSort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[100];

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        SelectionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int[] SelectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        return arr;
    }

}
