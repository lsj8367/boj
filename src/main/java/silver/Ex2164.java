package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            q.poll();
            final Integer poll = q.poll();
            q.offer(poll);
        }

        System.out.println(q.poll());

    }
}
