package algorithm;

import java.util.Scanner;

public class ex2742 {
	public static void main(String[] args) {
		//n부터 1까지 내림차순 출력하기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
