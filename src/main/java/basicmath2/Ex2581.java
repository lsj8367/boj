package basicmath2;

import java.util.Scanner;

public class Ex2581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = start; i <= end; i++) {
            boolean isDecimal = true;
            if (i == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isDecimal = false;
                }
            }

            if (isDecimal) {
                if (min > i) {
                    min = i;
                }
                sum += i;
            }

        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }

}
