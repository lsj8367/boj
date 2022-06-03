package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int maximum = arr[n - 1];
        int minimum = arr[0];

        int count = 0; // 최빈값 빈도수 체크 변수
        int max = -1; // 빈도수 를 0으로 비교해서는 안됨
        int mod = arr[0]; //최빈값 default 배열의 0번째
        boolean check = false;

        //최빈값 구하는 반복문
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                //중복값이 있으면 1을 더한다.
                count++;
            } else {
                //중복값이 없으면 count를 리셋한다.
                count = 0;
            }

            if (max < count) { //기존 max보다 빈도수가 많으면
                max = count; //max를 최신 빈도수로 변환
                mod = arr[i]; //다음 최빈값 수로 변경
                check = true; // 최빈값이 변경되었을때 체크표시를 한다.
            } else if (max == count && check) {
                mod = arr[i]; //다음 최빈값 수로 변경
                check = false; // 체크표시를 푼다.
            }

        }

        // 산술평균
        System.out.println(Math.round(sum / n));
        // 중앙값
        System.out.println(arr[(n - 1) / 2]);
        // 최빈값
        System.out.println(mod);
        // 범위
        System.out.println(maximum - minimum);
    }
}
