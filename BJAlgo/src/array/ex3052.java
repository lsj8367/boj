package array;

import java.util.Scanner;

public class ex3052 {
	public static void main(String[] args) {
		//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
		//그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int val[] = new int[42];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			val[arr[i] % 42]++;
		}
		
		for(int j = 0; j < val.length; j++) {
			if(val[j] != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
