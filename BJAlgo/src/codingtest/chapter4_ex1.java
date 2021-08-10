package codingtest;

import java.util.Scanner;

public class chapter4_ex1 {
    /*
     * 상하좌우
     * 여행가 A는 N x N 크기의 정사각형 공간 위에 서있다. 이 공간은 1 x 1 크기의 정사각형으로 나눠져 있다.
     * 가장 왼쪽 위 좌표는 (1, 1) 이며, 가장 오른쪽 아래 좌표는 (N, N)에 해당한다. 상 하 좌 우로 이동할 수 있으며
     * 시작 좌표는 항상 (1, 1) 이다.
     * L : 좌로 이동, R: 우로 이동, U: 위로 이동, D: 아래로 한칸 이동
     *
     */
    private static final int STANDARD = 1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = STANDARD;
        int y = STANDARD;
        sc.nextLine();

        String[] moves = sc.nextLine().split(" ");

        for (int i = 0; i < moves.length; i++) {
            switch (moves[i]) {
                case "L":
                    if(y > STANDARD) {
                        y--;
                    }
                    break;
                case "R":
                    if(y < n) {
                        y++;
                    }
                    break;
                case "U":
                    if(x > STANDARD) {
                        x--;
                    }
                    break;
                case "D":
                    if(x < n) {
                        x++;
                    }
                    break;
            }

        }

        System.out.println(x + " " + y);


    }
}
