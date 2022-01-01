package basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstPoint = br.readLine().split(" ");
        String[] secondPoint = br.readLine().split(" ");
        String[] thirdPoint = br.readLine().split(" ");

        int x = getX(firstPoint, secondPoint, thirdPoint);
        int y = getY(firstPoint, secondPoint, thirdPoint);

        System.out.println(x + " " + y);

    }

    public static int getX(String[] firstPoint, String[] secondPoint, String[] thirdPoint) {
        if (firstPoint[0].equals(secondPoint[0])) {
            return Integer.parseInt(thirdPoint[0]);
        }

        if (firstPoint[0].equals(thirdPoint[0])) {
            return Integer.parseInt(secondPoint[0]);
        }

        return Integer.parseInt(firstPoint[0]);
    }

    public static int getY(String[] firstPoint, String[] secondPoint, String[] thirdPoint) {
        if (firstPoint[1].equals(secondPoint[1])) {
            return Integer.parseInt(thirdPoint[1]);
        }

        if (firstPoint[1].equals(thirdPoint[1])) {
            return Integer.parseInt(secondPoint[1]);
        }

        return Integer.parseInt(firstPoint[1]);
    }

}
