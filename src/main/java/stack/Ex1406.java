package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex1406 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        final Stack<Character> left = new Stack<>();
        final Stack<Character> right = new Stack<>();

        // 기본 주어진 문자열 넣음
        for (int i = 0; i < str.length(); i++) {
            left.push(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            // L인 경우 커서를 왼쪽으로 옮기니까 오른쪽 스택에 담음
            if (command.equals("L")) {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            } else if (command.equals("D")) { // D는 오른쪽으로 옮기기에 왼쪽 스택에 담음
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if (command.equals("B")) { //무지성 왼쪽 스택 1개 삭제
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else if (command.contains("P")){
                left.push(command.charAt(2));
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        while (!right.isEmpty()) {
            bw.write(right.pop());
        }

        bw.flush();
    }
}
