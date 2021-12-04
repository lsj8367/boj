package silver;

import java.util.Scanner;

// 2n 타일링 2번째
public class Ex11727 {

    // 그려보면 n-1번째의 타일 + 1x2 타일 1개 추가된 경우
    // n-2 타일에 1x2 2개 또는 2x2 1개인 경우가 있음
    // dp[n] = dp[n - 1] + dp[n - 2] * 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] dp = new int[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= number; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
        }

        System.out.println(dp[number]);

    }

}
