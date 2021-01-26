package algorithm;

import java.util.Scanner;

public class ex2742 {
	public static void main(String[] args) {
		//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
