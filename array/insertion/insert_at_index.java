package insertion;

import java.util.Scanner;

public class insert_at_index {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[100];

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int value = s.nextInt();
        int index = s.nextInt();

        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        n++;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}