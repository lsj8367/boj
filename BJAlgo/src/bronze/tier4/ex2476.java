package bronze.tier4;

import java.util.Scanner;

public class ex2476 {
    //1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
    //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
    //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
    //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
    //예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
    // 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
    // 3개의 눈이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
    //N(2 ≤ N ≤ 1,000)명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //게임에 참여하는 인원수
        int i = 0;
        int price = 0;
        int max = 0;
        int result = 0;

        while(i < n){ //사람 n명 참여
            int one = sc.nextInt();
            max = one;

            int two = sc.nextInt();
            if(two > max) max = two;

            int three = sc.nextInt();
            if(three > max) max = three;


            if(one == two && two == three){ //같은눈 3개
                price = 10000 + (one * 1000);
            }else if(one == two || one == three){
                price = 1000 + (one * 100);
            }else if(two == three){
                price = 1000 + (two * 100);
            }else{
                price = max * 100;
            }
            result = Math.max(result, price);

            i++;
        }
        System.out.println(result);
    }
}
