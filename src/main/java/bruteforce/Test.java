package bruteforce;

import java.util.Arrays;

public class Test {

    public void asdasd(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.sort(numbers);

        int max = 0;
        int idx = 0;
        int[] temp = null;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (max < sum) {

                    // 배열의 길이와 현재 index가 같은지 판별
                    if (numbers.length == idx) {
                        idx++;

                        // 새로운 배열 생성
                        temp = new int[idx];
                        max = sum;

                        // 새로운 배열에 값 넣어주기
                        for (int k = 0; k < idx; k++) {
                            if (k < answer.length) {
                                temp[k] = answer[k];
                            } else {
                                temp[k] = max;
                            }
                        }

                        answer = temp;
                    } else {
                        answer[idx] = sum;
                        max = sum;
                        idx++;
                    }
                }
            }
        }
    }
}
