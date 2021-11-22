package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex10871 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String ss = br.readLine();
			String[] text = ss.split(" ");
			int n = Integer.parseInt(text[0]); 
			int x = Integer.parseInt(text[1]);
			
			int cnt = 0;
			String aa = br.readLine();
			for(int i = 0; i < n; i++) {
				String[] arr = aa.split(" ");
				
				if(Integer.parseInt(arr[i]) < x) {
					bw.write(Integer.parseInt(arr[i]) + " ");
					if(cnt == (arr.length - 1)) {
						bw.write(Integer.parseInt(arr[i]));
					}
				}
				cnt++;
			}
			
			bw.flush();
			bw.close();
			br.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
