package greedy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Ex1715 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Long> q = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            q.offer(sc.nextLong());
        }

        long answer = 0;

        while (q.size() > 1) {
            final long v1 = q.poll();
            final long v2 = q.poll();

            final long sum = v1 + v2;
            answer += sum;
            q.offer(sum);
        }

        System.out.println(answer);
    }

}
