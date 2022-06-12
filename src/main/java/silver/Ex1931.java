package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<MeetingRoom> list = new ArrayList<>();


        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list.add(new MeetingRoom(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list);

        int count = 0;
        int endTime = 0;

        for (MeetingRoom meetingRoom : list) {
            if (endTime <= meetingRoom.startTime) {
                endTime = meetingRoom.endTime;
                count++;
            }
        }

        System.out.println(count);
    }

    private record MeetingRoom(int startTime, int endTime) implements Comparable<MeetingRoom> {

        @Override
        public int compareTo(final MeetingRoom o) {
            if (endTime == o.endTime) {
                return Integer.compare(startTime, o.startTime);
            }
            //기본 끝나는시간순 정렬
            return Integer.compare(endTime, o.endTime);
        }

    }
}
