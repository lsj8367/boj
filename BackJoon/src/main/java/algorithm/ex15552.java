package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex15552 {
	public static void main(String[] args) {
		try {
			//10950 buffer사용
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				String value = br.readLine();
				String[] arr = value.split(" ");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				writer.write((a + b) + "\n");
			}
			writer.flush();
			writer.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
	}
}
