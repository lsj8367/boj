package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex22864 {

    private static final int ONE_DAY = 24;
    private static int 피로도_측정기 = 0;
    private static int result = 0;
    private static int 피로도;
    private static int 일처리량;
    private static int 피로도감소량;
    private static int 피로도MAX;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 일하면 피로도 A 쌓임
        // 일은 B만큼 처리가능
        // 한시간 쉬면 C만큼 피로도 줄음 (단, 피로도 음수값이면 0으로 바뀜)
        // max 피로도 M
        StringTokenizer st = new StringTokenizer(br.readLine());

        피로도 = Integer.parseInt(st.nextToken());
        일처리량 = Integer.parseInt(st.nextToken());
        피로도감소량 = Integer.parseInt(st.nextToken());
        피로도MAX = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 24; i++) {
            recursive();
        }

        System.out.println(result);
    }

    private static void recursive() {
        if (피로도_측정기 + 피로도 > 피로도MAX) {
            피로도_측정기 -= 피로도감소량;
            if (피로도_측정기 < 0) {
                피로도_측정기 = 0;
            }
        } else {
            피로도_측정기 += 피로도;
            result += 일처리량;
        }
    }

}
