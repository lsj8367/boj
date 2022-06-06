package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");

        Arrays.sort(arr, (o1, o2) -> Integer.compare(Integer.parseInt(o2), Integer.parseInt(o1)));

        for (String s : arr) {
            System.out.print(s);
        }
    }
}
