package basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[246913];

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (arr[i]) {
                continue;
            }

            for (int j = i * i; j <= arr.length; j += i) {
                arr[j] = true;
            }
        }

        while (true) {
            int start = Integer.parseInt(br.readLine());

            if (start == 0) {
                break;
            }

            int count = 0;

            for (int i = start + 1; i <= start * 2; i++) {
                if (!arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }


    }

}
