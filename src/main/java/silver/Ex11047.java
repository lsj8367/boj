package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11047 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int totalPrice = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        // 동전 input
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;

        // 동전 중에 가장 비싼곳부터 탐색
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] <= totalPrice) {
                result += totalPrice / arr[i];
                totalPrice %= arr[i];
            }
        }

        System.out.println(result);
    }

}
