package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25501 {
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            count = 0;
            final String s = br.readLine();
            System.out.println(palindrome(s, 0, s.length() - 1) + " " + count);
        }
    }

    private static int palindrome(final String s, final int start, final int end) {
        count++;
        if (start >= end) {
            return 1;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return 0;
        }

        return palindrome(s, start + 1, end - 1);
    }

}
