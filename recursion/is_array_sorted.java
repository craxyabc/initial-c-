package recursion;

import java.util.*;

public class is_array_sorted {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(is_sorted(arr, 0));

    }

    private static boolean is_sorted(int[] arr, int i) {

        if (arr.length - 1 == i) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return is_sorted(arr, i + 1);

    }

}
