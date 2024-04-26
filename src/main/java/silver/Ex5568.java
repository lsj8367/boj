package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Ex5568 {
    static int[] cards;
    static Set<String> numbers = new HashSet<>();
    static int k;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        cards = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(br.readLine());
        }

        dfs(0, "");

        System.out.println(numbers.size());
    }

    private static void dfs(final int index, final String number) {
        if (index == k) {
            numbers.add(number);
            return;
        }

        for (int i = 0; i < cards.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(index + 1, number + cards[i]);
                visited[i] = false;
            }

        }

    }

}
