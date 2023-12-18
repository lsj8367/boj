package silver;

import java.util.Scanner;
import java.util.Stack;

public class Ex5397 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            final String[] subStrings = s.split("");

            for (String subString : subStrings) {
                switch (subString) {
                    case "<" -> {
                        if (!left.isEmpty()) {
                            right.push(left.pop());
                            break;
                        }
                    }
                    case ">" -> {
                        if (!right.isEmpty()) {
                            left.push(right.pop());
                            break;
                        }
                    }
                    case "-" -> {
                        if (!left.isEmpty()) {
                            left.pop();
                            break;
                        }
                    }
                    default -> left.push(subString);
                }
            }

            while (!left.isEmpty()) {
                right.push(left.pop());
            }
            while (!right.isEmpty()) {
                sb.append(right.pop());
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
