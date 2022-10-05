package 문자열;

import org.junit.jupiter.api.Test;

public class Ex2941 {

    @Test
    void test() {
        final int a = solution("dz=ak");
        System.out.println(a);
    }

    // c는 =, - 가 올 수 있음
    // d는 z=나 - 가 올 수 있음
    // l과 n은 j가 올 수 있음
    // s, z는 = 가 올 수 있음

    public int solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'c' && i < s.length() - 1) {
                final char next = s.charAt(i + 1);
                if (next == '=' || next == '-') {
                    i++;
                }
            } else if (c == 'd' && i < s.length() - 1) {
                final char next = s.charAt(i + 1);
                if (next == 'z' && i < s.length() - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                } else if (next == '-') {
                    i++;
                }
            } else if ((c == 'l' || c == 'n') && i < s.length() - 1) {
                final char next = s.charAt(i + 1);
                if (next == 'j') {
                    i++;
                }
            } else if ((c == 's' || c == 'z') && i < s.length() - 1) {
                final char next = s.charAt(i + 1);
                if (next == '=') {
                    i++;
                }
            }

            count++;
        }

        return count;
    }

}
