package silver;

import java.io.IOException;
import java.util.Scanner;

public class Ex4375 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int value = 0;

            divide(num, value);
        }
    }

    private static void divide(final int num, int value) {
        for (int i = 1;; i++) {
            value = (value * 10 + 1) % num;
            if (value == 0) {
                System.out.println(i);
                break;
            }
        }
    }

}
