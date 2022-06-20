package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11052 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final int[] arr = new int[n + 1]; // 카드 덱 1부터 시작하기 위해 + 1
        final int[] dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + arr[j]);
            }
        }
        System.out.println(dp[n]);
    }
}
