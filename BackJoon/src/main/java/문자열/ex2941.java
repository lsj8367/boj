package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2941 {
	public static void main(String[] args) throws IOException{
		/*
		예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
		크로아티아 알파벳	변경
		č	c=
		ć	c-
		dž	dz=
		đ	d-
		lj	lj
		nj	nj
		š	s=
		ž	z=
		예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
		dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
		입력
		첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
		단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String ss = br.readLine().trim();
			int count = 0;
			
			
			for(int i = 0; i < ss.length(); i++) {
				char st = ss.charAt(i);
				if(st == 'c' && i < ss.length() - 1) { //c= 이거나 c-일경우
					if(ss.charAt(i + 1) == '=' || ss.charAt(i + 1) == '-') {
						i++; //그 다음으로 넘어가야해서 ++
					}

				}else if(st == 'd' && i < ss.length() - 1) {
					if(ss.charAt(i + 1) == 'z' && i < ss.length() - 2) {
						if(ss.charAt(i + 2) == '=') { // dz= 인경우
							i += 2;
						}
					}else if(ss.charAt(i + 1) == '-') { // d- 인 경우
						i++;
					}
					
				}else if ((st == 'l' || st == 'n') && i < ss.length() - 1) { // lj거나 nj인 경우
					if(ss.charAt(i + 1) == 'j') {
						i++;
					}
					
				}else if ((st == 's' || st == 'z') && i < ss.length() - 1) { //s=나 z=인 경우
					if(ss.charAt(i + 1) == '=') {
						i++;
					}
					
				}
				
				count++;
			}
			
			System.out.println(count);
	}
}
