package basicmath2;

public class Test {

    public static void main(String[] args) {
        //마지막 수
        int N = 120;
        //N크기의 배열
        boolean[] arr = new boolean[N + 1];

        for (int i = 2; i * i <= N; i++) {
            for (int j = i * i; j <= N; j += i) {
                arr[j] = true;
            }
        }

        for (int i = 2; i <= N; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }

}
