package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Ex18312 {

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
//
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        LocalTime localTime = LocalTime.of(0, 0, 0);
//
//        LocalTime maxTime = LocalTime.of(N, 59, 59);
//
//        int count = 0;
//
//        while (localTime.isBefore(maxTime)) {
//            final String format = localTime.format(formatter);
//            if (format.contains(String.valueOf(K))) {
//                count++;
//            }
//            localTime = localTime.plusSeconds(1);
//        }
//
//        System.out.println(count);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    int H = i / 10;
                    int h = i % 10;
                    int M = j / 10;
                    int m = j % 10;
                    int S = k / 10;
                    int s = k % 10;
                    if(H == K || h == K || M == K || m == K || S == K || s == K) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
