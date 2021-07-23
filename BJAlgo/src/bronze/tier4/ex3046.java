package bronze.tier4;

import java.util.Scanner;

public class ex3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // S = (r1 + r2) / 2
        // 11 15
        // 15 = (11 + x) / 2
        // (15 * 2) - 11 = x
        // 2S - r1 = r2
        int r1 = sc.nextInt();
        int s = sc.nextInt();
        System.out.println((2 * s) - r1);
    }
}
