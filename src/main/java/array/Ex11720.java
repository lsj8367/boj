package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        final int[] arr = Arrays.stream(br.readLine().split(""))
            .mapToInt(Integer::parseInt)
            .toArray();

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.println(sum);
    }
}
