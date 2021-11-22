package recursion;

import java.util.Scanner;

public class ex10870 {
//	피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
//	이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
//	n=17일때 까지 피보나치 수를 써보면 다음과 같다.
//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//	n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibo(n));
		//0 1 1 2 3 5 8
	}
	
	public static int fibo(int n) {
		if(n == 0) //첫번째 수는 0고정
			return 0;
		if(n == 1) // 두번째 수는 1 고정
			return 1;
		
		// n의 앞값과 2번째 앞값을 구하여 n번째 숫자를 출력해야 되기 때문에 n-1 n-2 두개를 재귀로 호출한다.
		return fibo(n - 1) + fibo(n - 2);
	}

}
