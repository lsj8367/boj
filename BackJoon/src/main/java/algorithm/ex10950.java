package algorithm;

import java.util.Scanner;

public class ex10950 {
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스마다 A+B를 출력한다.
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((a + b));
		}
	}
}
