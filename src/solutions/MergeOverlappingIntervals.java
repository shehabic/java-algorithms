package solutions;

import java.util.*;

public class MergeOverlappingIntervals {

    public static void test() {
        MergeOverlappingIntervals sut = new MergeOverlappingIntervals();
        Interval[][] samples = new Interval[][]{
            {new Interval(1, 5), new Interval(4, 8), new Interval(8, 9), new Interval(10, 15)},
            {new Interval(1, 5), new Interval(2, 4)},
            {new Interval(1, 2), new Interval(3, 4), new Interval(5, 6)},
            {},
            {new Interval(2, 6), new Interval(1, 4)},
            {new Interval(0, 2), new Interval(4, 6), new Interval(1, 4), new Interval(5, 8), new Interval(4, 6)}
        };
        for (Interval[] input : samples) {
            System.out.println("Intervals " + Arrays.deepToString(input));
            List<Interval> results = sut.merge(Arrays.asList(input));
            Interval[] res = new Interval[results.size()];
            System.out.println("Output: \n" + Arrays.deepToString(results.toArray(res)));
        }
    }

    public static class Interval {
        int start, end;
        Interval(int s, int e) {
            start = s;
            end = e;
        }
        @Override
        public String toString() { return "[" + start + "," + end + "]"; }
    }

    public List<Interval> merge(List<Interval> intervals) {
        intervals.sort((a, b) -> a.start - b.start);
        if (intervals.isEmpty())return new ArrayList<>();
        Interval merged = intervals.get(0);
        List<Interval> results = new ArrayList<>();
        for (Interval current: intervals) {
            if (merged.end >= current.start) {
                merged.end = Math.max(current.end, merged.end);
            } else {
                results.add(merged);
                merged = current;
            }
        }
        if (results.size() == 0 || results.get(results.size() - 1) != merged) results.add(merged);

        return results;
    }
}
