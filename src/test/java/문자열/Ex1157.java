package 문자열;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Ex1157 {

    @Test
    void test() {
        final String s1 = solution("Mississipi");
        final String s2 = solution("zZa");
        final String s3 = solution("z");
        final String s4 = solution("baaa");


        assertAll(
            () -> assertThat(s1).isEqualTo("?"),
            () -> assertThat(s2).isEqualTo("Z"),
            () -> assertThat(s3).isEqualTo("Z"),
            () -> assertThat(s4).isEqualTo("A")
        );
    }

    private static String solution(final String s) {
        Map<String, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final String key = String.valueOf(c).toUpperCase();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (String character : map.keySet()) {
            if (map.get(character) > max) {
                max = map.get(character);
            }
        }

        int duplicate = 0;

        String maxKey = null;
        for (String character : map.keySet()) {
            if (max == map.get(character)) {
                duplicate++;
                maxKey = character;
            }
        }

        if (duplicate >= 2) {
            return "?";
        }


        return maxKey.toUpperCase();
    }

}
