package bronze;

import java.util.Scanner;

public class ex1871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum = sc.nextInt();
        String first = "";
        String second = "";

        for(int i = 0; i < totalNum; i++) {
            String text = sc.next();
            String[] arr = text.split("-");
            first = arr[0];
            second = arr[1];
            int resultA = 0;

            for(int j = 0; j < first.length(); j++) {
                int value = first.charAt(j) - 'A';
                value *= Math.pow(26, 2 - j);
                resultA += value;
            }
            int resultB = Integer.parseInt(second);
            System.out.println(isGood(resultA, resultB));
        }
    }

    public static String isGood(int resultA, int resultB) {
        if(Math.abs(resultA - resultB) <= 100) {
            return "nice";
        }

        return "not nice";
    }
}
