package 문자열;

import java.util.Scanner;

public class ex11720 {
	public static void main(String[] args) {
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String bb = sc.next();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(String.valueOf(bb.charAt(i)));
		}
		System.out.println(sum);
		
	}
}
