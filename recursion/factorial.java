package recursion;

import java.util.*;

public class factorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(factorial(n));

    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}
