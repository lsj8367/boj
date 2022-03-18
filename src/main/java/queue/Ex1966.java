package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1966 {

    private static class Document {

        private int location;
        private int value;

        public Document(final int location, final int value) {
            this.location = location;
            this.value = value;
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sampleDataSet = Integer.parseInt(br.readLine());


        for (int i = 0; i < sampleDataSet; i++) {
            int answer = 1; //몇번째로 인쇄되는지
            StringTokenizer st = new StringTokenizer(br.readLine());
            int qSize = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            Queue<Document> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < qSize; j++) {
                q.offer(new Document(j, Integer.parseInt(st.nextToken())));
            }

            while (!q.isEmpty()) {
                final Document first = q.poll();

                boolean isBigger = true;

                for (Document document : q) {
                    if (first.value < document.value) {
                        isBigger = false;
                        break;
                    }
                }

                if (!isBigger) {
                    q.offer(first);
                } else {
                    if (first.location == index) {
                        System.out.println(answer);
                    } else {
                        answer++;
                    }
                }


            }

        }
    }

}
