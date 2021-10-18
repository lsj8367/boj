package silver;

import java.util.Arrays;
import java.util.Scanner;

public class ex2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int n = 3;

        int test = sc.nextInt();
        int[] result = new int[test];

        for (int i = 0; i < test; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            result[i] = arr[arr.length - n];
        }

        Arrays.stream(result).forEach(System.out::println);

    }
}
