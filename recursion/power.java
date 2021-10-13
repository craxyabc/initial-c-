package recursion;

import java.util.*;

public class power {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(power(a, b));

    }

    private static int power(int a, int b) {

        if (b == 0) {
            return 1;
        }

        return a * power(a, b - 1);

    }

}
