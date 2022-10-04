package 문자열;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex2675 {

    @ParameterizedTest
    @MethodSource
    void test(final String actual, final String expected) {
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        final Ex2675 ex = new Ex2675();
        return Stream.of(
            Arguments.of(ex.solution(3, "ABC"), "AAABBBCCC"),
            Arguments.of(ex.solution(5, "/HTP"), "/////HHHHHTTTTTPPPPP")
        );
    }

    private String solution(final int repeat, final String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < repeat; j++) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
