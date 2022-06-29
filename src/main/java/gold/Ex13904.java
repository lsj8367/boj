package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex13904 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Report> reportList = new ArrayList<>();

        int maxPeriod = 0;

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            // 기본 값 세팅
            final int day = Integer.parseInt(st.nextToken());
            final int score = Integer.parseInt(st.nextToken());
            reportList.add(new Report(day, score));

            // 최고 일 수 세팅
            maxPeriod = Math.max(day, maxPeriod);
        }

        int totalScore = 0;
        for (int i = maxPeriod; i > 0; i--) {
            totalScore += getTotalScore(reportList, i);
        }

        System.out.println(totalScore);
    }

    private static int getTotalScore(final List<Report> reportList, final int maxPeriod) {
        int removeIndex = -1;
        int result = 0;

        for (int j = 0; j < reportList.size(); j++) {
            if (reportList.get(j).day >= maxPeriod && result < reportList.get(j).score) {
                removeIndex = j;
                result = reportList.get(j).score;
            }

        }

        if (result == 0) {
            return 0;
        }

        reportList.remove(removeIndex);

        return result;
    }

    private static class Report {
        private final int day;
        private final int score;

        public Report(final int day, final int score) {
            this.day = day;
            this.score = score;
        }
    }
}
