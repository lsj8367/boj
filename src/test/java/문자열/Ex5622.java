package 문자열;

import org.junit.jupiter.api.Test;

class Ex5622 {

    @Test
    void test() {
        final int unucic = solution("UNUCIC");
        System.out.println(unucic);
    }

    public int solution(final String s) {
        // 1까지 다이얼 돌리는게 2초
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (65 <= c && c <= 67) {
                result += 3;
            } else if (68 <= c && c <= 70) {
                result += 4;
            } else if (71 <= c && c <= 73) {
                result += 5;
            } else if (74 <= c && c <= 76) {
                result += 6;
            } else if (77 <= c && c <= 79) {
                result += 7;
            } else if (80 <= c && c <= 83) {
                result += 8;
            } else if (84 <= c && c <= 86) {
                result += 9;
            } else if (87 <= c && c <= 90) {
                result += 10;
            }

        }

        return result;
    }


}
