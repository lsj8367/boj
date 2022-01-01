package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SampleQueue {

    private static int[] queue;
    private static int popCount = 0;
    private static int pushCount = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        queue = new int[t];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "front":
                    System.out.println(front());
                    break;
                case "back":
                    System.out.println(back());
                    break;
            }
        }

    }

    private static void push(int number) {
        queue[++pushCount] = number;
    }

    private static int pop() {
        if (empty() == 1) {
            return -1;
        }
        return queue[popCount++];
    }

    private static int size() {
        return pushCount - popCount + 1;
    }

    private static int empty() {
        if (size() == 0) {
            return 1;
        }
        return 0;
    }

    private static int front() {
        if (empty() == 1) {
            return -1;
        }
        return queue[popCount];
    }

    private static int back() {
        if (empty() == 1) {
            return -1;
        }
        return queue[pushCount];
    }


}
