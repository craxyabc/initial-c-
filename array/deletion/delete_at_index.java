package deletion;

import java.util.Scanner;

public class delete_at_index {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[100];

        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int del_index = s.nextInt();

        if (del_index < n) {
            for (int i = del_index; i < n; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
