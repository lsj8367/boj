package 문자열;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;

public class Ex1152 {

    @Test
    void test() {
        assertThat(solution("The Curious Case of Benjamin Button")).isEqualTo(6);
        assertThat(solution("The first character is a blank")).isEqualTo(6);
        assertThat(solution("The last character is a blank")).isEqualTo(6);
        assertThat(solution(" ")).isEqualTo(0);
    }

    private int solution(final String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        return st.countTokens();
    }

}
