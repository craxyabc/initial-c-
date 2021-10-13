package searching;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[100];

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int find_val = s.nextInt();

        System.out.println(find_val + " found at " + binarySearch(arr, 0, n, find_val));

    }

    private static int binarySearch(int[] arr, int low, int high, int find_val) {

        int mid = (low + high) / 2;
        if (arr[mid] == find_val) {
            return mid;
        }

        if (arr[mid] > find_val) {
            return binarySearch(arr, low, mid - 1, find_val);
        }

        if (arr[mid] < find_val) {
            return binarySearch(arr, mid + 1, high, find_val);
        }

        return -1;
    }

}
