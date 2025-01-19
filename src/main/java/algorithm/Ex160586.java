package algorithm;

import java.util.HashMap;
import java.util.Map;

// 대충 만든 자판 프로그래머스
public class Ex160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<String, Integer> map = new HashMap<>();

        for (String key : keymap) {
            final String[] split = key.split("");

            for (int i = 0; i < split.length; i++) {
                final Integer value = map.get(split[i]);

                if (value == null || !(value < i + 1)) {
                    map.put(split[i], i + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            final String target = targets[i];
            final String[] split = target.split("");

            for (final String s : split) {
                if (map.get(s) == null) {
                    answer[i] = -1;
                    break;
                }
                answer[i] = answer[i] + map.get(s);
            }
        }

        return answer;
    }
}
