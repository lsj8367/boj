package slicingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex12891 {

    private static final int PASSWORD_LENGTH = 4;

    //기준이 되는 배열
    private static int[] standards;
    // 맞추려는 배열
    private static int[] corrects;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열의 총 길이
        int n = Integer.parseInt(st.nextToken());

        // 부분 배열의 길이
        int part = Integer.parseInt(st.nextToken());

        // 0이상은 무조건 통과니까 +1
        char[] strings = br.readLine().toCharArray();

        // 결과
        int result = 0;

        standards = new int[PASSWORD_LENGTH];

        corrects = new int[PASSWORD_LENGTH];

        // 비밀번호 ACGT 갯수
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            standards[i] = Integer.parseInt(st.nextToken());

            if (standards[i] == 0) {
                // 0 이상은 무조건 포함이니까 바로 1더하기
                count++;
            }
        }


        for (int i = 0; i < part; i++) {
            add(strings[i]);
        }

        if (count == 4) {
            //a,c,g,t 모두 기준에 포함되면 결과 +1
            result++;
        }

        for (int i = part; i < n; i++) {
            int nextIndex = i - part;
            add(strings[i]);
            remove(strings[nextIndex]);

            if (count == 4) {
                result++;
            }
        }

        System.out.println(result);

    }

    private static void add(char c) {
        switch (c) {
            // 추가의 경우엔 먼저 배열 값 더하고 기준값과 비교해서 같으면 매칭 + 1
            case 'A' -> {
                corrects[0]++;
                if (corrects[0] == standards[0]) {
                    count++;
                }
            }
            case 'C' -> {
                corrects[1]++;
                if (corrects[1] == standards[1]) {
                    count++;
                }
            }
            case 'G' -> {
                corrects[2]++;
                if (corrects[2] == standards[2]) {
                    count++;
                }
            }
            case 'T' -> {
                corrects[3]++;
                if (corrects[3] == standards[3]) {
                    count++;
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + c);
        }

    }

    private static void remove(char c) {
        switch (c) {
            // 제거의 경우 먼저 배열값이 같으면 -1 후에 배열값 뺌
            case 'A' -> {
                if (corrects[0] == standards[0]) {
                    count--;
                }
                corrects[0]--;
            }
            case 'C' -> {
                if (corrects[1] == standards[1]) {
                    count--;
                }
                corrects[1]--;
            }
            case 'G' -> {
                if (corrects[2] == standards[2]) {
                    count--;
                }
                corrects[2]--;
            }
            case 'T' -> {
                if (corrects[3] == standards[3]) {
                    count--;
                }
                corrects[3]--;
            }

            default -> throw new IllegalStateException("Unexpected value: " + c);
        }
    }

}
