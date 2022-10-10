package 재귀;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Ex10872 {

    @Test
    void test() {
        final int solution = solution(5);
        assertThat(solution).isEqualTo(120);
    }

    private int solution(final int n) {
        if (n == 0) {
            return 1;
        }

        return n * solution(n - 1);
    }
}
