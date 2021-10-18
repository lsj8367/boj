package silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] road = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong) .toArray();

        long[] city = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong) .toArray();

        long cost = road[0]*city[0];
        long minValue = city[0];

        for (int i = 1; i<n-1; i++){
            minValue = Math.min(minValue, city[i]);
            cost += minValue * road[i];
        }
        System.out.print(cost);
    }
}

