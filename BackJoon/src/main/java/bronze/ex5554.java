package bronze;

import java.util.Scanner;

public class ex5554 {
    public static void main(String[] args) {
        //집 -> 학교 이동시간 (초)
        //학교 -> pc방 이동시간 (초)
        //pc방 -> 학원 이동시간 (초)
        //학원 -> 집 이동시간 (초)
        // 이동시간은 항상 1분 0초 이상 59분 59초 이하.
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int forth = sc.nextInt();

        int count = first + second + third + forth;

        System.out.println(count / 60);
        System.out.println(count % 60);
    }
}
