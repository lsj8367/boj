package function;

import java.util.Scanner;

public class ex1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nn = sc.nextInt();
		
		int count = 0;
		if(nn < 100) {
			count = nn;
			System.out.println(count);
		}else if(nn >= 100){
			count = 99;
			for(int i = 100; i <= nn; i++) {
				if(hansu(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	private static boolean hansu(int n) {
		int[] arr = new int[3];
		
		if(n == 1000) {
			return false;
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = n % 10;
			n /= 10;
			if(n <= 0) {
				break;
			}
		}
		return abc(arr);
	}
	
	private static boolean abc(int[] arr) { //등차수열 판별
		int a = arr[1] - arr[0]; //공차
		for(int j = 2; j < arr.length; j++) {
			if(arr[j] - arr[j-1] != a) {
				return false;
			}
		}
		return true;
	}
}
