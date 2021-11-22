package bronze;

import java.util.Scanner;

public class ex2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = 0;
        int x2 = 0;
        int sum = 0;
        int max = 0;

        for(int i = 0; i < 4; i++) {
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            if(i == 0) {
                sum = x1 + x2;
            }else {
                sum = sum - x1 + x2;
            }
            max = getMaxNum(max, sum);
        }
        System.out.println(max);
    }

    public static int getMaxNum(int max, int num) {
        if(num >= max) {
            max = num;
        }
        return max;
    }
}
