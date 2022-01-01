package basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4153 {

    private static final String RIGHT = "right";
    private static final String WRONG = "wrong";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            System.out.println(pythagoras(x, y, z));
        }

    }

    public static String pythagoras(int x, int y, int z) {
        if ((x * x + y * y) == z * z) {
            return RIGHT;
        }
        if ((x * x + z * z) == y * y) {
            return RIGHT;
        }

        if ((y * y + z * z) == x * x) {
            return RIGHT;
        }

        return WRONG;
    }

}
