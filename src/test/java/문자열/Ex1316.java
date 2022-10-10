package 문자열;

import static org.assertj.core.api.Assertions.assertThat;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex1316 {


    @Test
    void test() {
        String[] arr = new String[]{"happy", "new", "year"};
        int result = 0;
        for (int i = 0; i < 3; i++) {
            final boolean solution = solution(arr[i]);
            if (solution) {
                result++;
            }
        }

        assertThat(result).isEqualTo(3);
    }

    private boolean solution(final String str) {
        final boolean[] checkArr = new boolean[26];
        int charInt = 0;

        for (int i = 0; i < str.length(); i++) {
            final char c = str.charAt(i);
            if (charInt != c) {
                if (!checkArr[c - 'a']) {
                    checkArr[c - 'a'] = true;
                    charInt = c;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

}
