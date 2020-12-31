package algorithm;

import java.util.Scanner;

public class ex2438 {

	public static void main(String[] args) {
		// 별찍기 줄마다 별이 1개씩 늘어나는것 구현
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
