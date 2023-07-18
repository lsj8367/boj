package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex17266 {

    static int[] locations;
    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 다리의 길이
        length = Integer.parseInt(br.readLine());
        // 가로등 총 개수
        int lampCount = Integer.parseInt(br.readLine());

        // 가로등 위치
        locations = new int[lampCount];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < lampCount; i++) {
            locations[i] = Integer.parseInt(st.nextToken());
        }

        int left = 1; // 가장 짧은 다리의 길이
        int right = length; // 가장 끝의 다리 길이
        int result = 0; // 적절한 높이

        while (left <= right) {
            int mid = (left + right) / 2; // 다리의 중앙값

            if (possible(mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    private static boolean possible(int mid) {
        int value = 0; //가로등의 위치

        for (int i = 0; i < locations.length; i++) {

            // 가로등 위치 - 가운데의 길이가 0 과 같거나 작으면 적절한 길이라는 의미
            if (locations[i] - mid <= value) {
                value = locations[i] + mid; // 위치에 중간값을 더해서 다음 위치를 구한다.
            } else {
                return false; //값이 위치보다 크단것은 모자라다는 이야기
            }
        }
        return length - value <= 0; // 맨 끝자리까지 유효한지?
    }
}
