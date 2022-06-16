package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11004 {

    private static int k;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //배열 총크기 에서 -1 해줘야함
        k = Integer.parseInt(st.nextToken()); //인덱스라 -1 해줘야함

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        k--;
        quickSort(arr, 0, n - 1);

        System.out.println(arr[k]);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = pivot(arr, start, end);

            if (pivot == k) {
                return;
            } else if (k < pivot) { //피봇 기준 작은 부분
                quickSort(arr, start, pivot - 1); //start 부터 피봇 index의 -1
            } else {
                quickSort(arr, pivot + 1, end); // pivot + 1 부터 end
            }
        }
    }

    private static int pivot(int[] arr, int start, int end) {
        int middle = (start + end) / 2; //중앙값을 기준으로 잡는다.
        swap(arr, start, middle); //중앙값을 맨앞으로 보내 시작지점과 스왑
        int pivot = arr[start]; // 중앙값을 첫 pivot으로 잡기로 함

        int left = start;
        int right = end;

        while (left < right) { //back의 인덱스가 더 크면
            while (pivot < arr[right]) { // 피봇보다 arr의 back번째 데이터가 크면
                right--; //back을 줄임
            }
            while (left < right && pivot >= arr[left]) { // back인덱스가 더 크고, pivot이 arr front 인덱스의 데이터보다 크거나 같은경우
                left++; // front를 증가시킴
            }

            swap(arr, left, right); // 그리고 나서 두 위치를 스왑시킨다. ??? 노이해
        }

        arr[start] = arr[left];
        arr[left] = pivot;
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
