package 재귀;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ex25501 {

    @MethodSource
    @ParameterizedTest
    void test3(final String ss, final Result expected) {
        final Result result = new Result(0, 0);
        solution(ss, result);
        assertThat(result.judge).isEqualTo(expected.judge);
        assertThat(result.count).isEqualTo(expected.count);
    }

    private static Stream<Arguments> test3() {
        return Stream.of(
            Arguments.of("AAA", new Result(1, 2)),
            Arguments.of("ABBA", new Result(1, 3)),
            Arguments.of("ABABA", new Result(1, 3)),
            Arguments.of("ABCA", new Result(0, 2)),
            Arguments.of("PALINDROME", new Result(0, 1))
        );
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int repeat = Integer.parseInt(br.readLine());
//
//        Result[] results = new Result[repeat];
//
//        for(int i = 0; i < repeat; i++) {
//            results[i] = new Result(0, 0);
//        }
//
//        for (Result result : results) {
//            solution(br.readLine(), result);
//        }
//
//        for(Result result : results) {
//            System.out.println(result.judge + " " + result.count);
//        }
//    }

    private void solution(final String str, final Result result) {
        result.judge = isPalindrome(str, result);
    }

    private int isPalindrome(final String str, final Result result) {
        return recursive(str, 0, str.length() - 1, result);
    }

    private int recursive(final String str, final int left, final int right, final Result result) {
        result.count++;

        if (left >= right) {
            return 1;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return 0;
        }

        return recursive(str, left + 1, right - 1, result);
    }

    private static class Result {
        private int judge;
        private int count;

        public Result(final int judge, final int count) {
            this.judge = judge;
            this.count = count;
        }

    }

}
