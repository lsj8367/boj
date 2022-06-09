package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1427_1 {

    private static int newArr[];
    private static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");

        newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < newArr.length; i++) {
            max = i;
            for (int j = i + 1; j < newArr.length; j++) {
                if (newArr[j] > newArr[max]) {
                    max = j;
                }
            }

            swap(i);
        }

        for (final int j : newArr) {
            System.out.print(j);
        }
    }

    private static void swap(final int index) {
        if (newArr[index] < newArr[max]) {
            int temp = newArr[index];
            newArr[index] = newArr[max];
            newArr[max] = temp;
        }
    }

}
