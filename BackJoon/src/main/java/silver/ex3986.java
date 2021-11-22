package silver;

import java.util.Scanner;
import java.util.Stack;

public class ex3986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;

        // A와B로만 이루어진 단어 한줄에 하나씩 주어짐.

        for (int i = 0; i < n; i++) {
            String ss = sc.next();
            //단어 한줄
            // 스택 생성
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < ss.length(); j++) {
                // 스택이 비어있지 않거나, 스택 최상단의 문자와 문자열의 j번째 값이 같으면
                if(!stack.isEmpty() && stack.peek() == ss.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(ss.charAt(j));
                }

            }

            if (stack.size() == 0) result++;
        }

        System.out.println(result);
    }
}
