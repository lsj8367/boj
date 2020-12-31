package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex2741 {
	public static void main(String[] args) {
		try {
			// 자연수 N이 주어졌을때 1부터 n까지 출력.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= n; i++) {
				bw.write(i + "\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
