package recursion;

import java.util.*;

public class last_index_in_array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int value = s.nextInt();

        System.out.println(last_index(arr, arr.length - 1, value));

    }

    private static int last_index(int[] arr, int i, int value) {

        if (i == -1) {
            return -1;
        }

        if (arr[i] == value) {
            return i;
        }

        return last_index(arr, i - 1, value);

    }

}
