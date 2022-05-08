package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            long targetNumber = arr[i];
            int start = 0;
            int end = n - 1;

            while (start < end) {
                long sum = arr[start] + arr[end];
                if (sum == targetNumber) {
                    if (start != i && end != i) {
                        result++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else {
                        end--;
                    }
                } else if (sum < targetNumber) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        System.out.println(result);

    }
}
