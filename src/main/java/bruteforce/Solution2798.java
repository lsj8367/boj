package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2798 {

    private static int value;

    // 카드의 합이 21을 넘지않기
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int count = Integer.parseInt(st.nextToken()); // 전체 갯수
        value = Integer.parseInt(st.nextToken()); // 만들어야 하는 수

        int[] arr = new int[count];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(bruteforce(count, arr));


    }

    private static int bruteforce(final int count, final int[] arr) {
        int result = 0;

        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == value) {
                        return sum;
                    }

                    if (sum > result && sum < value) {
                        result = sum;
                    }

                }
            }
        }
        return result;
    }
}
