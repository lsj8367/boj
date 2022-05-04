package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] points = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i = 0; i < points.length; i++) {
            points[i] = Integer.parseInt(st.nextToken());

            if (points[i] > max) {
                max = points[i];
            }
        }

        int sum = 0;

        for (int point : points) {
            sum += point;
        }

        // 공식 -> (100a + 100b + 100c) / max / n -> ( a + b + c ) * 100 / max / n
        double result = (double) sum * 100 / max / n;

        System.out.println(result);
    }
}
