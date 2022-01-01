package basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9020 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final boolean[] decimalArray = makeDecimal();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(br.readLine());
            int front = number / 2;
            int back = number / 2;

            while (true) {
                if (!decimalArray[front] && !decimalArray[back]) {
                    System.out.println(front + " " + back);
                    break;
                }

                front--;
                back++;
            }

        }


    }

    public static boolean[] makeDecimal() {
        boolean[] arr = new boolean[10001];

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (arr[i]) {
                continue;
            }

            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }

        }

        return arr;
    }

}
