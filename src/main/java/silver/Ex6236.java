package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex6236 {

    static int[] costs;


    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer st = new StringTokenizer(br.readLine());

        final int n = Integer.parseInt(st.nextToken());
        final int m = Integer.parseInt(st.nextToken());

        costs = new int[n];

        int low = 1;
        int high = 10_000 * 100_000;

        for (int i = 0; i < costs.length; i++) {
            costs[i] = Integer.parseInt(br.readLine());
            low = Math.max(low, costs[i]);
        }

        int answer = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (getCount(mid) > m) {
                low = mid + 1;
            } else {
                answer = mid;
                high = mid - 1;
            }

        }

        System.out.println(answer);
    }

    private static int getCount(int mid) {
        int value = mid;
        int count = 1;

        for (int cost : costs) {
            if (value - cost < 0) {
                count++;
                value = mid;
            }
            value -= cost;
        }
        return count;
    }

}
