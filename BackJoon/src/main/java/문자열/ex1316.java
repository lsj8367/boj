package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		/*
		그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
		예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
		aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
		단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
		
		첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
		둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
		 */
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(check()) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	static boolean check() throws IOException{
		boolean[] checkArr = new boolean[26];
		int result = 0;
		String aa = br.readLine().toLowerCase(); //무조건 소문자
		
		for(int i = 0; i < aa.length(); i++) {
			int index = aa.charAt(i);
			
			if(result != index) { //기존 값과 알파벳값이 다르다면 (중복검사 수행)
				if(!checkArr[index - 'a']) { //false가 아니라면? --> 이미 한번 나온 알파벳
					checkArr[index - 'a'] = true; //나왔으니까 기본 false를 true로 바꿔줌
					result = index; // 초기화 했던 값을 나온 알파벳으로 바꿔줌
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
