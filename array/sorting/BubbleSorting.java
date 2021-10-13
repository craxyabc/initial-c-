package sorting;

import java.util.Scanner;

public class BubbleSorting {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[100];

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int[] bubbleSort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            for (int j = 1; i < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

}
