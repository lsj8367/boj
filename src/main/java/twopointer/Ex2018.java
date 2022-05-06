package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1 ~ 15까지
        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (end != n) {
            if (sum > n) {
                // 합계 > 주어진 수
                sum -= start;
                start++;
            } else if (sum < n) {
                // 합계 < 주어진 수
                end++;
                sum += end;
            } else {
                count++;
                end++;
                sum += end;
            }
        }

        System.out.println(count);
    }
}
