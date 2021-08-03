package silver;

import java.util.Map;
import java.util.Scanner;

/*
문제
다솜이는 0과 1로만 이루어진 문자열 S를 가지고 있다.
다솜이는 이 문자열 S에 있는 모든 숫자를 전부 같게 만들려고 한다.
다솜이가 할 수 있는 행동은 S에서 연속된 하나 이상의 숫자를 잡고 모두 뒤집는 것이다.
뒤집는 것은 1을 0으로, 0을 1로 바꾸는 것을 의미한다.

예를 들어 S=0001100 일 때,

전체를 뒤집으면 1110011이 된다.
4번째 문자부터 5번째 문자까지 뒤집으면 1111111이 되어서 2번 만에 모두 같은 숫자로 만들 수 있다.
하지만, 처음부터 4번째 문자부터 5번째 문자까지 문자를 뒤집으면 한 번에 0000000이 되어서 1번 만에 모두 같은 숫자로 만들 수 있다.

문자열 S가 주어졌을 때, 다솜이가 해야하는 행동의 최소 횟수를 출력하시오.

입력
첫째 줄에 문자열 S가 주어진다. S의 길이는 100만보다 작다.

출력
첫째 줄에 다솜이가 해야하는 행동의 최소 횟수를 출력한다.
 */
public class ex1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();

        //0이 1로 1이 0으로 바뀌는 횟수
        int count[] = new int[2];
        char changeStr = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (changeStr != (arr[i])) {
                count[changeStr - 48]++;
                changeStr = arr[i];
            }
        }
        // 0이 1로 바뀌는지
        // 1이 0으로 바뀌는지에 대한 1 더하기
        count[changeStr - 48]++;

        System.out.println(Math.min(count[0], count[1]));
    }
}