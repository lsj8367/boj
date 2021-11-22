package silver;

import java.util.Scanner;
import java.util.Stack;

public class ex10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            if(n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        long sum = 0;
        while (stack.size() != 0) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
