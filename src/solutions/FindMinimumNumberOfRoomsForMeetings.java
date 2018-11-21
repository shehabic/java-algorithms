package solutions;

import java.util.HashMap;
import java.util.Map;

public class FindMinimumNumberOfRoomsForMeetings {
    public static void test() {
        Interval[][] intervals = new Interval[][] {
            {new Interval(0, 30), new Interval(5, 10), new Interval(15, 20)},
            {new Interval(7, 10), new Interval(2, 4)},
            {new Interval(1, 5), new Interval(2, 4),  new Interval(1, 5),  new Interval(2, 4)}
        };
        FindMinimumNumberOfRoomsForMeetings sut = new FindMinimumNumberOfRoomsForMeetings();
        for (Interval[] item: intervals) {
            System.out.println("Input:");
            for(Interval i: item)System.out.print("[" + i.start + "," + i.end + "] , ");
            System.out.println("\nOutput: " + sut.minMeetingRooms(item));
        }
    }

    public int minMeetingRooms(Interval[] intervals) {
        int maxOverlapping = 0;
        Map<Integer, Integer> intervalsCounter = new HashMap<>();
        int minStart = Integer.MAX_VALUE;
        int maxEnd = Integer.MIN_VALUE;
        for (Interval i: intervals) {
            minStart = Math.min(minStart, i.start);
            maxEnd = Math.max(maxEnd, i.end);
            int countStart = intervalsCounter.getOrDefault(i.start, 0);
            int countEnd = intervalsCounter.getOrDefault(i.end, 0);
            intervalsCounter.put(i.start, countStart + 1);
            intervalsCounter.put(i.end, countEnd - 1);
        }
        int runningCount = 0;
        for (int i = minStart; i < maxEnd; i++) {
            runningCount += intervalsCounter.getOrDefault(i, 0);
            maxOverlapping = Math.max(maxOverlapping, runningCount);
        }

        return maxOverlapping;
    }


    private static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }


}
