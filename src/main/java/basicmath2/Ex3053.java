package basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());

        double euclid = r * r * Math.PI;
        double taxi = r * r * 2;

        System.out.printf("%.6f", euclid);
        System.out.println();
        System.out.printf("%.6f", taxi);
    }

}
