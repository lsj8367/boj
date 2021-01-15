package array;

import java.util.Scanner;

public class ex10818 {
	public static void main(String[] args) {
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		int max = -1000000;
		int min = 1000000;
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}