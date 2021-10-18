package 문자열;

import java.util.Scanner;

public class ex10809 {
	public static void main(String[] args) {
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다.
		// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		/*
		각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
		만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		baekjoon
		1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		*/
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		int[] arr = new int[26];
		int index = 0; //배열 인덱스값
		
		for(int i = 0; i < ss.length(); i++) {
			index = (int)(ss.charAt(i)) - 97; //아스키코드로 - 최소 97을 빼줌
			if(arr[index] == 0) { // 인덱스값 == 알파벳 위치 번호
				arr[index] = i + 1;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] - 1);
			System.out.print(" ");
		}
		
	}
}
