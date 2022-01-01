package basicmath2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11653 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        //하나로 나눌수있을때까지 최대한 나눠서 출력뽑아야함
        for (int i = 2; i <= Math.sqrt(N); i++) {
            // i로 안나눠질때 까지 최대한 나눈 후 i++ 이 되어야함
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }

        if (N != 1) {
            sb.append(N);
        }

        System.out.println(sb);
    }

}
