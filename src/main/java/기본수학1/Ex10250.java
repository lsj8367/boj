package 기본수학1;

import java.util.Scanner;

public class Ex10250 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int floor = sc.nextInt();
            int rooms = sc.nextInt(); //입력 값에서 주어지지만 실제로 사용되는 것은 없다.
            int guest = sc.nextInt();

            int roomNumber = guest / floor;

            if (guest % floor == 0) {
                System.out.println((floor * 100) + roomNumber);
            } else {
                System.out.println((guest % floor * 100) + (roomNumber + 1));
            }
        }
    }

}
