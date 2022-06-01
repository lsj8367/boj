package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Ex1377 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Data[] arr = new Data[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Data(i, Integer.parseInt(br.readLine()));
        }

        System.out.println(bubbleSort(arr));
    }

    public static int bubbleSort(final Data[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(o -> o.value));

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].index - i) {
                max = arr[i].index - i;
            }
        }

        return max + 1;
    }

    public record Data(int index, int value) implements Comparable<Data> {
        @Override
        public int compareTo(final Data o) {
            return Integer.compare(this.value, o.value);
        }
    }

}
