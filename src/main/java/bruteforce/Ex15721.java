package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex15721 {

    static int A, T, NAME;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());
        NAME = Integer.parseInt(br.readLine());

        System.out.println(bbunDegiGame());

    }

    private static int bbunDegiGame() {
        int bbunCount = 0;
        int degiCount = 0;
        int round = 2; //뻔뻔데기데기 부터 시작

        while (true) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                    bbunCount++;
                    if (NAME == 0 && bbunCount == T) {
                        return seatedPerson(bbunCount, degiCount, A);
                    }
                } else {
                    degiCount++;
                    if (NAME == 1 && degiCount == T) {
                        return seatedPerson(bbunCount, degiCount, A);
                    }
                }

            }

            for (int i = 0; i < round; i++) {
                bbunCount++;
                if (NAME == 0 && bbunCount == T) {
                    return seatedPerson(bbunCount, degiCount, A);
                }
            }

            for (int i = 0; i < round; i++) {
                degiCount++;
                if (NAME == 1 && degiCount == T) {
                    return seatedPerson(bbunCount, degiCount, A);
                }
            }

            round++;
        }
    }

    private static int seatedPerson(final int bbunCount, final int degiCount, final int A) {
        return (bbunCount + degiCount - 1) % A;
    }

}
