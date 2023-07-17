package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex10815 {

    private static int[] cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cards = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int value = Integer.parseInt(st.nextToken());

            answer.append(binarySearch(value)).append(" ");
        }

        System.out.println(answer);
    }

    private static int binarySearch(int value) {
        int first = 0;
        int last = cards.length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;

            if (cards[mid] == value) {
                return 1;
            } else if (cards[mid] > value) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return 0;
    }
}
