package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        int start = 0;
        int end = numbers.length - 1;

        int count = 0;

        while (start < end) {
            final int value = numbers[start] + numbers[end];
            //합과 정해진 sum이 같은경우 그 위의 인덱스부터는 다 값이 큰경우라서 start는 늘리고 end는 줄여야한다.
            if (value > sum) {
                end--;
            } else if (value < sum) {
                start++;
            } else {
                count++;
                start++;
                end--;
            }
        }

        System.out.println(count);
    }
}
