package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Ex24060 {

    static int[] A, tmp;
    static int count = 0;
    static int result = -1;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        tmp = new int[N];
        mergeSort(A, 0, N - 1);
        System.out.println(result);

    }

    private static void mergeSort(int[] arr, int front, int last) {
        if (count > K) {
            return;
        }
        if (front < last) {
            int middle = (front + last) / 2;
            mergeSort(arr, front, middle);
            mergeSort(arr, middle + 1, last);
            merge(arr, front, middle, last);
        }
    }

    private static void merge(int[] arr, int first, int middle, int last) {
        int front = first;
        int back = middle + 1;
        int target = 0;

        while (front <= middle && back <= last) {
            if (arr[front] <= arr[back]) {
                tmp[target] = arr[front];
                front++;
            } else {
                tmp[target] = arr[back];
                back++;
            }
            target++;
        }

        while (front <= middle) {
            tmp[target++] = arr[front++];
        }

        while (back <= last) {
            tmp[target++] = arr[back++];
        }

        front = first;
        target = 0;
        while (front <= last) {
            count++;
            if (count == K) {
                result = tmp[target];
                break;
            }
            arr[front++] = tmp[target++];
        }
    }

}
