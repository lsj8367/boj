package 기본수학1;

import java.util.Scanner;

public class Ex1193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int crossPrev = 0; //이전 대각선의 분수 갯수
        int cross = 1; //현재 대각선의 분수 갯수

        while (true) {
            if (X <= cross + crossPrev) {

                if (cross % 2 == 1) { //해당 대각선이 홀수면
                    System.out.println((cross - (X - crossPrev - 1)) + "/" + (X - crossPrev));
                    break;
                } else {
                    System.out.println((X - crossPrev) + "/" + (cross - (X - crossPrev - 1)));
                    break;
                }

            } else {
                crossPrev += cross;
                cross++;
            }
        }
    }

}
