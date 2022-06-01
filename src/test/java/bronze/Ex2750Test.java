package bronze;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex2750Test {

    @Test
    void test() {
        final String bubble = Ex2750.bubbleSort(new int[]{5, 2, 3, 4, 1});
        Assertions.assertThat(bubble).isEqualTo("1\n2\n3\n4\n5\n");
    }
}