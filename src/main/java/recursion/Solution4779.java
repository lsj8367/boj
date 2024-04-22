package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4779 {
    private static StringBuilder ANSWER;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;

        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);
            ANSWER = new StringBuilder();
            int length = (int) Math.pow(3, n);

            for (int i = 0; i < length; i++) {
                ANSWER.append("-");
            }

            recursive(0, length);
            System.out.println(ANSWER);

        }

    }

    private static void recursive(final int start, final int length) {
        if (length == 1) {
            return;
        }

        int totalSize = length / 3;

        for (int i = start + totalSize; i < start + (totalSize * 2); i++) {
            ANSWER.setCharAt(i, ' ');
        }

        recursive(start, totalSize);
        recursive(start + (totalSize * 2), totalSize);
    }

}
