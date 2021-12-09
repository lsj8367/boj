package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2869 {

    public static void main(String[] args) throws IOException {
        String[] input = inputDatas();

        int plus = Integer.parseInt(input[0]);
        int minus = Integer.parseInt(input[1]);
        int value = Integer.parseInt(input[2]);

        int total = value - minus;
        int day = plus - minus;

        int answer = total / day;
        if (total % day != 0) {
            answer++;
        }

        System.out.println(answer);

    }

    private static String[] inputDatas() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine().split(" ");
    }

}
