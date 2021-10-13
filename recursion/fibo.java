package recursion;

import java.util.*;

public class fibo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(fibo(n));

    }

    private static int fibo(int n) {

        if (n == 1 || n == 0) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);

    }

}
