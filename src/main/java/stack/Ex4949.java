package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String ss = br.readLine();

            if (ss.equals(".")) {
                break;
            }

            sb.append(solution(ss)).append("\n");
        }

        System.out.println(sb);
    }

    private static String solution(final String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            final char item = input.charAt(i);
            if (item == '(' || input.charAt(i) == '[') {
                stack.push(item);
            } else if (item == ')') {

                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (item == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }

        }

        if (stack.isEmpty()) {
            return "yes";
        }

        return "no";
    }

}
