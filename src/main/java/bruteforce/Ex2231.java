package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int size = str.length();

        int n = Integer.parseInt(str);
        // 각 자릿수의 최대값은 9
        // 주어진 자릿수에서 최대로 나올 수 있는 한자리수의 합은 9 + 9 + 9 (세자리수 기준) 27 이다.
        int minValue = n - (9 * size); //189

        int answer = 0;

        for (int i = minValue; i < n; i++) {
            int sum = i;
            int number = i;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum == n) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);

    }
}
