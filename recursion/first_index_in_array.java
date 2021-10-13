package recursion;

import java.util.*;

public class first_index_in_array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int data = s.nextInt();

        System.out.println(first_index(arr, 0, data));

    }

    private static int first_index(int[] arr, int i, int data) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == data) {
            return i;
        }

        return first_index(arr, i + 1, data);
    }

}
