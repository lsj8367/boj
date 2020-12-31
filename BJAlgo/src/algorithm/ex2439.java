package algorithm;

import java.util.Scanner;

public class ex2439 {
	public static void main(String[] args) {
		// 오른쪽기준으로 별찍기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int n = 3;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
