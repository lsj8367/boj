package 재귀;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Ex10870 {
    
    @Test
    void test() {
        final int fibonacci = fibonacci(10);
        assertThat(fibonacci).isEqualTo(55);
    }
    
    private int fibonacci(final int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
