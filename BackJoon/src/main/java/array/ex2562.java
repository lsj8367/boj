package array;

import java.util.Scanner;

public class ex2562 {
	public static void main(String[] args) {
		//최대값을 구하고 그 값이 몇번째에 있는지 출력하시오.
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int n = sc.nextInt();
			arr[i] = n;
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index + 1);
	}
}
