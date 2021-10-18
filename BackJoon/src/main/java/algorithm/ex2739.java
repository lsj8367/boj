package algorithm;

import java.util.Scanner;

public class ex2739 {

    public static void main(String[] args) {
        //구구단 출력하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

}
