package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex20117 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        //배열은 0 부터 시작하기에 +1 조건은 제외
        if (n % 2 == 0) {
            // 배열이니까 0번부터 시작해서 짝수공식 (묶음갯수 / 2) 제외 + 1
            for (int i = n - 1; i >= n / 2; i--) {
                sum += arr[i] * 2;
            }
        } else {
            //홀수인 경우 (묶음 개수+1)/2)
            for (int i = n - 1; i > n / 2; i--) {
                sum += arr[i] * 2;
            }
            sum += arr[n / 2];
        }

        System.out.println(sum);
    }

}
