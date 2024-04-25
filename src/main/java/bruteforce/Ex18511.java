package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex18511 {

    static int N = 0;
    static int answer = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        arr = new int[size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        recursive(0);
        System.out.println(answer);
    }

    private static void recursive(final int value) {
        if (value > N) {
            return;
        }

        if (answer < value) {
            answer = value;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            recursive(value * 10 + arr[i]);
        }

    }

}
