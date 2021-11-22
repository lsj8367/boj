package while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex10951 {
	public static void main(String[] args) {
		//eof 처리 관련문제 
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		try {
			while(true) {
				String line = br.readLine();
				
				if(line == null || line.equals("")) {
					break;
				}
				
				st = new StringTokenizer(line);
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(a + b + "\n");
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
