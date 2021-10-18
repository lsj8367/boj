package bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class ex1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(String.valueOf(sc.nextBigInteger()));
        BigInteger m = new BigInteger(String.valueOf(sc.nextBigInteger()));

        System.out.println(n.divide(m));
        System.out.println(n.mod(m));

    }
}
