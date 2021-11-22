package recursion;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ex2447 {
	static char[][] arr;
	// 재귀적인 패턴으로 별을 찍어보자.
	//N이 3의 거듭제곱(3, 9, 27, ...) 이라고 할때, 크기 N의 패턴은 N * N의 정사각형 모양이다.
	// 크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
	//***
	//* *
	//***
	// N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의  (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다.
	//예를 들어 크기 27의 패턴은 예제 출력 1과 같다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new char[n][n];
		
		draw(0, 0, n, false);
		 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
		
	}
	
	public static void draw(int x, int y, int n, boolean empty) {
		
		//공백칸일때
		if(empty) {
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; y++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		// 블록이 최소여서 나눌수 없을때
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n/3;
		int count = 0;
		for(int i = x; i < x + n; i += size) {
			for(int j = y; j < y + n; j += size) {
				count++;
				if(count == 5) {
					draw(i, j, size, true);
				}else {
					draw(i, j, size, false);
				}
			}
		}
		
		
	}
}
