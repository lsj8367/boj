package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex10816 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자 카드 N개, 정수 M개
        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        // 숫자카드 배열
        final String[] numberCards = br.readLine().split(" ");

        for (String numberCard : numberCards) {
            map.put(numberCard, map.getOrDefault(numberCard, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        final String[] keys = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            sb.append(map.getOrDefault(key, 0) + " ");
        }

        System.out.println(sb.toString());
    }
}
