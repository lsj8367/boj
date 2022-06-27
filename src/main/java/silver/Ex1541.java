package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1541 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        final String[] split = br.readLine().split("-");

        for (int i = 0; i < split.length; i++) {
            final String s = split[i];
            int temp = 0;
            final String[] numbers = s.split("\\+");

            for (String number : numbers) {
                temp += Integer.parseInt(number);
            }

            if (i == 0) {
                sum = temp;
            } else {
                sum -= temp;
            }

        }

        System.out.println(sum);
    }

}
