package searching;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[100];

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int find_val = s.nextInt();

        System.out.println(find_val + " found at " + linearSearch(arr, n, find_val));

    }

    private static int linearSearch(int[] arr, int n, int find_val) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == find_val) {
                return i;
            }
        }

        return -1;
    }

}
