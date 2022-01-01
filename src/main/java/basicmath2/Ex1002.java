package basicmath2;

import java.util.Scanner;

public class Ex1002 {

    public static void main(String[] args) {
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
//        한 줄에 x1, y1, r1, x2, y2, r2가 주어진다.
//        x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.
//        각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (distance == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (distance > Math.abs(r2 - r1) && distance < r1 + r2) {
                System.out.println(2);
            } else if (r1 + r2 == distance || Math.abs(r2 - r1) == distance) {
                System.out.println(1);
            } else if (r1 + r2 < distance || Math.abs(r2 - r1) > distance || distance == 0) {
                System.out.println(0);
            }

        }
    }

}
