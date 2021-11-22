package bronze;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class ex2920Test {

    ex2920 ex2920 = new ex2920();
    String ascending = "1 2 3 4 5 6 7 8";
    String decending = "8 7 6 5 4 3 2 1";
    String mixed = "8 1 7 2 6 3 5 4";
    String mixed1 = "5 7 5 8 1 2 3 4";
    String mixed2 = "1 8 5 6 7 2 3 4";
    String mixed3 = "2 5 7 6 1 8 3 4";
    String mixed4 = "3 7 5 6 1 2 3 4";
    String mixed5 = "4 2 1 3 5 6 7 8";
    String mixed6 = "5 6 7 8 1 2 3 4";
    String mixed7 = "6 7 5 8 1 2 3 4";
    String mixed8 = "1 7 3 5 4 6 2 8";



    @Test
    void ascending() throws IOException {
        assertThat(ex2920.solution(ascending)).isEqualTo("ascending");
    }

    @Test
    void decending() throws IOException {
        assertThat(ex2920.solution(decending)).isEqualTo("decending");
    }

    @Test
    void mixed() throws IOException {
        assertThat(ex2920.solution(mixed)).isEqualTo("mixed");
    }

    @Test
    void mixed1() throws IOException {
        assertThat(ex2920.solution(mixed1)).isEqualTo("mixed");
    }

    @Test
    void mixed2() throws IOException {
        assertThat(ex2920.solution(mixed2)).isEqualTo("mixed");
    }

    @Test
    void mixed3() throws IOException {
        assertThat(ex2920.solution(mixed3)).isEqualTo("mixed");
    }

    @Test
    void mixed4() throws IOException {
        assertThat(ex2920.solution(mixed4)).isEqualTo("mixed");
    }

    @Test
    void mixed5() throws IOException {
        assertThat(ex2920.solution(mixed5)).isEqualTo("mixed");
    }
    @Test
    void mixed6() throws IOException {
        assertThat(ex2920.solution(mixed6)).isEqualTo("mixed");
    }

    @Test
    void mixed7() throws IOException {
        assertThat(ex2920.solution(mixed7)).isEqualTo("mixed");
    }

    @Test
    void mixed8() throws IOException {
        assertThat(ex2920.solution(mixed8)).isEqualTo("mixed");
    }

}