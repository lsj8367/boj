package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex11022 {
	public static void main(String[] args) {
		try {
			// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= t; i++) {
				String ss = br.readLine();
				String[] arr = ss.split(" ");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
			}
			bw.flush();
			bw.close();
			br.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
