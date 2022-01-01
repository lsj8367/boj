package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            // 문장 띄어쓰기 기준으로 자르고
            char[] sentence = br.readLine().toCharArray();

            for (char text : sentence) {
                if (text != ' ') {
                    stack.push(text);
                } else {
                    //스택이 계속 차있으면
                    appendPopChar(stack, sb);
                    sb.append(" ");
                }
            }

            appendPopChar(stack, sb);

            System.out.println(sb);
        }
    }

    private static void appendPopChar(Stack<Character> stack, StringBuilder sb) {
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    }

}
