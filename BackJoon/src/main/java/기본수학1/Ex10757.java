package 기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex10757 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(String.valueOf(sc.next()));
        final BigInteger b = new BigInteger(String.valueOf(sc.next()));

        a = a.add(b);
        System.out.println(a);
    }

}
