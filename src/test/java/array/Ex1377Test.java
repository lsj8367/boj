package array;

import static org.assertj.core.api.Assertions.assertThat;
import array.Ex1377.Data;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex1377Test {

    @ParameterizedTest
    @MethodSource
    void test(final Data[] data, int expected) {
        assertThat(Ex1377.bubbleSort(data)).isEqualTo(expected);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
            Arguments.of(new Data[]{
                new Data(0, 10),
                new Data(1, 1),
                new Data(2, 5),
                new Data(3, 2),
                new Data(4, 3)
            }, 3),
            Arguments.of(new Data[]{
                new Data(0, 1),
                new Data(1, 3),
                new Data(2, 5),
                new Data(3, 7),
                new Data(4, 9)
            }, 1)
        );
    }

}