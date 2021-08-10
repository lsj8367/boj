package codingtest;

import java.util.Scanner;

public class chapter4_2 {
    /*
     * 체스 나이트 옮기기
     * 8 x 8 체스판
     * L자로 이동 가능한데 두가지
     * 1. 수평 2칸 수직 1칸
     * 2. 수직 2칸 수평 1칸
     * 자리가 주어졌을 때, 이동할 수 있는 경우의 수 출력하기
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        // 좌표 입력 받고
        String[] a = sc.nextLine().split("");
        int nextX = 0;
        int nextY = 0;

        x = a[0].charAt(0);
        y = Integer.parseInt(a[1]);
        int result = 0;

        int[][] cases = {{-2, 1}, {-2, -1}, {-1, 2}, {-1, -2}, {1, 2}, {1, -2}, {2, 1}, {2, -1}};
        // a: 97  h: 104
        for (int[] aCase : cases) {
            nextX = x + aCase[0];
            nextY = y + aCase[1];
            if (nextX > 97 && nextX < 104 && nextY > 1 && nextY < 8) {
                result++;
            }
        }
        System.out.println(result);
    }
}
