package silver;

import java.io.IOException;
import java.util.Scanner;

public class Ex9095 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] dp = new int[11];

        dp[0] = 0;
        dp[1] = 1; // 1
        dp[2] = 2; // 1+1, 2
        dp[3] = 4; // 1+1+1, 1+2, 2+1, 3

        for (int i = 0; i < number; i++) {
            int a = sc.nextInt();
            for (int j = 4; j <= a; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }
            System.out.println(dp[a]);
        }

    }

}
