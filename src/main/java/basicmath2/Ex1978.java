package basicmath2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1978 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        // 1, 3, 5, 7
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            boolean isDecimal = false;

            if (number == 1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    isDecimal = true;
                }
            }

            if (!isDecimal) {
                count++;
            }
        }
        System.out.println(count);
    }

}
