package algorithm;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex160586Test {

    @MethodSource
    @ParameterizedTest
    void test(String[] keymap, String[] targets) {
        final Ex160586 ex160586 = new Ex160586();
        final int[] solution = ex160586.solution(keymap, targets);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    private static Stream<Arguments> test() {
        return Stream.of(
            Arguments.of(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"}),
            Arguments.of(new String[]{"AA"}, new String[]{"B"}),
            Arguments.of(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"})
        );
    }

}