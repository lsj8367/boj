package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1259 {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String forward = br.readLine();

            if (forward.equals("0")) {
                break;
            }

            String reverse = "";
            for (int i = forward.length() - 1; i >= 0; i--) {
                reverse += forward.charAt(i);
            }

            if (forward.equals(reverse)) {
                bw.write(YES + "\n");
            } else {
                bw.write(NO + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
