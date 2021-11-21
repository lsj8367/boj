package recursion;

import java.util.Scanner;

public class Ex11729 {
    static StringBuilder sb = new StringBuilder();

    public static void hanoi(int number, char start, char middle, char last) {
        if(number == 1) {
            sb.append(start + " " + last).append('\n');
            return;
        }

        hanoi(number - 1, start, last, middle);
        sb.append(start + " " + last).append('\n');
        hanoi(number - 1, middle, start, last);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        sb.append((int) (Math.pow(2, number) - 1)).append('\n');

        hanoi(number, '1', '2', '3');
        System.out.println(sb.toString());
    }

}