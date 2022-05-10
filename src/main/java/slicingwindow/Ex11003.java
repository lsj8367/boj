package slicingwindow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex11003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Node> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }

            deque.addLast(new Node(i, now));

            // i가 주어진 슬라이싱 범위 L보다 커질경우 맨앞 제거
            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }

            bw.write(deque.getFirst().value + " ");
        }

        bw.flush();
        bw.close();
    }

    private static class Node {
        private int index;
        private int value;

        public Node(final int index, final int value) {
            this.index = index;
            this.value = value;
        }

    }
}
