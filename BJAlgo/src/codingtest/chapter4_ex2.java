package codingtest;

import java.util.Scanner;

public class chapter4_ex2 {
    /*
     * 정수 N이 입력되면 00시00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램
     * 1을 입력했을때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각.
     */
    private static boolean check(int h, int m, int s) {
        if(h % 10 == 3 || m % 10 == 3 || m / 10 == 3 || s % 10 == 3 || s / 10 == 3)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < 60; j++) {
                for(int k = 0; k < 60; k++) {
                    if(check(i, j, k)) count++;
                }
            }
        }

        System.out.println(count);
    }
}
