package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex1026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, a, b));
    }

    private static int solution(final int n, final int[] a, final int[] b) {
        Integer[] temp = new Integer[n];

        for (int i = 0; i < n; i++) {
            temp[i] = b[i];
        }

        Arrays.sort(a);
        Arrays.sort(temp, Collections.reverseOrder());

        int minSum = 0;

        for (int i = 0; i < n; i++) {
            minSum += a[i] * temp[i];
        }

        return minSum;
    }

}
