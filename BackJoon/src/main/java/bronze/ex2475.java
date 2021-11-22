package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2475 {
    //검증수
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            //입력 받고
            String[] aa = br.readLine().split(" ");
            int sum = 0;

            // 각각 제곱해야함
            for(String a : aa){
                sum += (int)Math.pow(Double.parseDouble(a), 2);
            }
            // 10으로 나눈 나머지
            System.out.println(sum % 10);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
