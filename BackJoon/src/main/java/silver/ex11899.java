package silver;

import java.util.Scanner;
import java.util.Stack;

public class ex11899 {
    /*
    문제 괄호 끼워넣기
    심심한 승현이는 너무 심심한 나머지 올바른 괄호열을 가지고 놀고 있었습니다.
    (()(()))()()
    그러다가 어쩌다 보니 괄호열을 부러뜨렸습니다.
    (()    ((    )))()    ()
    크게 낙담한 승현이는 노력해 보았지만, 대부분이 부러져 버려 단 한 부분만 재사용할 수 있다는 것을 깨닫게 되었습니다.
    )))()
    승현이는 이 괄호열을 가지고 놀려고 했으나 올바른 괄호열이 아니기 때문에 행복하지 않았습니다. 이를 보던 지학이는 승현이에게 “그러면 앞과 뒤에 적절하게 괄호를 붙이면 올바른 괄호열이 되지 않을까?”라고 했고, 승현이는 조금 생각한 뒤 그렇게 하기로 했습니다. 예를 들어, 위의 올바르지 않은 괄호열의 경우 앞에 여는 괄호 3개를 붙이면 올바른 괄호열이 됩니다.
    ((()))()
    그러나 괄호열을 사서 붙이는 데에는 돈이 들고 많이 붙일수록 놀기가 불편해지기 때문에, 승현이는 가능한 한 괄호열을 적게 추가하려고 합니다.
    승현이가 망가뜨리고 사용 가능한 올바르지 않은 괄호열이 주어질 때, 올바른 괄호열으로 만들기 위해 앞과 뒤에 붙여야 할 괄호의 최소 개수를 구하는 프로그램을 작성하세요.
    입력
    첫 번째 줄에 올바르지 않은 괄호열 S가 주어집니다. S의 길이는 1 이상 50 이하입니다.
    출력
    첫 번째 줄에 S를 올바른 괄호열으로 만들기 위해 앞과 뒤에 붙여야 할 괄호의 최소 개수를 출력합니다. 불가능한 경우는 주어지지 않습니다.
    예제 입력 1
    )))()
    예제 출력 1
    3
    예제 입력 2
    )(()
    예제 출력 2
    2
    예제 입력 3
    ))()((
    예제 출력 3
    4
    예제 입력 4
    )(()(()))
    예제 출력 4
    1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char bracket = str.charAt(i);
            if(bracket == '(') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    count++;
                } else {
                    stack.pop();
                }
            }
        }

        count += stack.size();

        System.out.println(count);
    }
}