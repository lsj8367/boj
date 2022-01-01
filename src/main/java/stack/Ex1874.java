package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int total = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int countIndex = 0;

        for (int i = 0; i < total; i++) {
            final int number = Integer.parseInt(br.readLine());
            if (number > countIndex) {
                for (int j = countIndex + 1; j <= number; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                countIndex = number;
            } else if (stack.peek() != number) {
                System.out.println("NO");
                System.exit(0); //break로 하게되면 밑에 Sysout sb 를 찍어버린다. (출력초과)
            }

            stack.pop();
            if (i == total - 1) {
                sb.append("-");
            } else {
                sb.append("-").append("\n");
            }
        }
        System.out.println(sb);
    }

}