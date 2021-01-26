package 문자열;

import java.util.Scanner;

public class ex2675 {
	public static void main(String[] args) {
		/*
		문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
		QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
		*/
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = 0;
		String ss = "";
		String result = "";
		
		for(int i = 0; i < t; i++) {
			n = sc.nextInt();
			ss = sc.next();
			result = abc(n, ss);
			System.out.println(result);
		}
	}
	
	public static String abc(int n, String ss) {
		String result = "";
		for(int i = 0; i < ss.length(); i++) {
			for(int j = 0; j < n; j++) {
				result += Character.toString(ss.charAt(i));		
			}
		}
		return result;
	}
}
