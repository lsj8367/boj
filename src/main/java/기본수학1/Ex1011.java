package 기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1011 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            //시작지점
            int x = Integer.parseInt(tokenizer.nextToken());
            //이동해야할 지점
            int y = Integer.parseInt(tokenizer.nextToken());

            //거리
            int distance = y - x;

            //최대 횟수
            int max = (int) Math.sqrt(distance);

            if (max == Math.sqrt(distance)) {
                sb.append(max * 2 - 1)
                    .append("\n");
            } else if (distance <= max * max + max) {
                sb.append(max * 2)
                    .append("\n");
            } else {
                sb.append(max * 2 + 1).append("\n");
            }

        }

        System.out.println(sb);
    }

}