package silver;

import java.util.Scanner;

public class ex2609 {
    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1 = gcd(a, b);

        int result2 = lcm(a, b);

        System.out.println(result1);
        System.out.println(result2);
    }
}
