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
			int n = 0;
			int x = 0;
			String ss = br.readLine();
			for(int i = 0; i < 2; i++) {
				String[] text = ss.split(" ");
				n = Integer.parseInt(text[0]);
				x = Integer.parseInt(text[1]);
			}
			
			String aa = br.readLine();
			for(int i = 0; i < n; i++) {
				String[] arr = aa.split(" ");
				
				if(Integer.parseInt(arr[i]) < x) {
					bw.write(arr[i] + " ");
				}
				
			}
			
			bw.flush();
			bw.close();
			br.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
