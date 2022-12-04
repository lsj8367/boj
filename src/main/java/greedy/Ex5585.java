package greedy;

import java.io.IOException;
import java.util.Scanner;

public class Ex5585 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int money = 1000;
        int value = sc.nextInt();

        int price = money - value;
        int count = 0;
        int i = 0;
        while (price >= 1) {
            if (price >= 500) {
                //500
                i = price / 500;
                price %= 500;
            } else if (price >= 100) {
                i = price / 100;
                //100
                price %= 100;
            } else if (price >= 50) {
                i = price / 50;
                //50
                price %= 50;
            } else if (price >= 10) {
                i = price / 10;
                //10
                price %= 10;
            } else if (price >= 5) {
                i = price / 5;
                //5
                price %= 5;
            } else {
                i = price;
                //1
                price %= 1;
            }
            count += i;
        }

        System.out.println(count);
    }
}
