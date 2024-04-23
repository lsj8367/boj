package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String number = br.readLine();
        int value = Integer.parseInt(number);

        int start = value - (9 * number.length());
        int result = 0;

        for (int i = start; i < value; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == value) {
                result = i;
                break;
            }
        }

        System.out.println(result);

    }

}
