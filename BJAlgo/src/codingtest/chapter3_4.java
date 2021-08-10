package codingtest;

import java.util.Scanner;

public class chapter3_4 {
    /*
    어떠한 수 N이 1이 될때까지 두 과정중 하나를 반복수행
    2번째 연산은 N이 K로 나눠질때만 선택이 가능
    1. N에서 1씩 뺀다.
    2. N을 K로 나눈다.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        if (n % k == 0) {
            while(n > 1) {
                n /= k;
                count++;
            }
        } else {
            while(n > 1) {
                n--;
                count++;
            }
        }

        System.out.println(count);
    }
}
