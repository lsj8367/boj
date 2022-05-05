package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int divideNumber = Integer.parseInt(st.nextToken());

        int sum = 0;
        int[] remainArr = new int[divideNumber];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % divideNumber;
            remainArr[sum]++;
        }

        long answer = remainArr[0];
        for (int i = 0; i < divideNumber; i++) {
            answer += (long) remainArr[i] * (remainArr[i] - 1) / 2;
        }
        System.out.println(answer);
    }
}
