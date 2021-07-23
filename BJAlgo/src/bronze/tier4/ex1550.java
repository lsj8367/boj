package bronze.tier4;

import java.util.Scanner;

public class ex1550 {
    //16진수 입력받아 10진수 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x16 = sc.next();

        System.out.println(Integer.valueOf(x16, 16));
    }
}
