package 문자열;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;

class Ex2908 {

    @Test
    void test() {
        assertThat(solution("734 893")).isEqualTo(437);
        assertThat(solution("221 231")).isEqualTo(132);
        assertThat(solution("839 237")).isEqualTo(938);
    }

    public int solution(final String ss) {
        StringTokenizer st = new StringTokenizer(ss, " ");

        // 숫자 두개를 뒤집어서 크기를 비교한다.
        final int left = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
        final int right = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());

        return left > right ? left : right;
    }

}
