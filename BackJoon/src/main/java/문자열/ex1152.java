package 문자열;

import java.util.Scanner;

public class ex1152 {
	public static void main(String[] args) {
		//영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
		//이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine(); //줄단위로 입력받음
		
		String[] words = ss.trim().split(" ");
		int count = 0;
		
		if(words[0].equals("")) { //엔터만 쳤을때의 경우 배열이 있는것으로 나오게된다.
			System.out.println(count);
		}else {
			System.out.println(words.length);
		}
	}
}
