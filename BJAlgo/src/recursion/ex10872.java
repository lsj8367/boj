package recursion;

import java.util.Scanner;

public class ex10872 {

	public static void main(String[] args) {
		// 재귀함수를 통한 팩토리얼 N! 출력하기
		// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
		// 입력 : 첫째 줄에 정수 N이 주어진다
		// 출력 : N! 을 출력한다
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}

	public static int factorial(int n) {
		if(n == 0){
			return 1;
		}else {
			return factorial(n - 1) * n;
		}
	}
}
