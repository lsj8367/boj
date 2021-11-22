package 문자열;

import java.util.Scanner;

public class ex1157 {
	public static void main(String[] args) {
		//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
		Scanner sc = new Scanner(System.in);
		
		String ss = sc.next().toUpperCase(); //무조건 소문자로 바꿈
		int[] arr = new int[26];
		int max = 0;
		int count = 0;
		int result = 0; //알파벳 더하려고

		for(int i = 0; i < ss.length(); i++) {
			char a = ss.charAt(i);
			//65은 a 의 아스키코드값
			arr[a - 65]++;
		}

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i]; //최대값
			}
		}

		//max 중복값
		for(int i = 0; i < arr.length; i++) {
			if(max == arr[i]) {
				count++; // 중복 최대값 갯수 체크
				result = i;
			}			
		}

		if(count > 1) {
			System.out.println("?");
		}else {
			System.out.println((char)(result + 65));
		}
	}
}
