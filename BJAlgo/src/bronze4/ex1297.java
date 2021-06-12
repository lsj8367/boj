package bronze4;

import java.util.Scanner;

public class ex1297 {
    public static void main(String[] args) {
//        첫째 줄에 TV의 대각선 길이, TV의 높이 비율,
//        TV의 너비 비율이 공백 한 칸을 사이에 두고 주어진다.
//        대각선 길이는 5보다 크거나 같고, 1,000보다 작거나 같은 자연수,
//        높이 비율은 1보다 크거나 같고, 99보다 작거나 같은 자연수 너비 비율은 2보다 크거나 같고,
//        100보다 작거나 같은 자연수이다. 너비 비율은 항상 높이 비율보다 크다.
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(); //대각선
        int h = sc.nextInt(); //높이비율
        int w  = sc.nextInt(); //너비비율

        double x = Math.sqrt(Math.pow(l, 2) / (Math.pow(h, 2) + Math.pow(w, 2)));
        System.out.println((int)Math.floor(x * h) + " " + (int)Math.floor(x * w));

    }
}
