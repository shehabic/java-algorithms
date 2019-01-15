package solutions;

import java.util.*;

public class SkyLinesProblem {

    class BuildingPoint {
        int x;
        int height;
        boolean isStart;

        public BuildingPoint(int x, int height, boolean isStart) {
            this.x = x;
            this.height = height;
            this.isStart = isStart;
        }
    }

    public List<int[]> getSkyline(int[][] buildings) {
        List<BuildingPoint> points = new ArrayList<>();
        for (int[] building : buildings) {
            points.add(new BuildingPoint(building[0], building[2], true));
            points.add(new BuildingPoint(building[1], building[2], false));
        }
        points.sort((a, b) -> {
            if (a.x != b.x) return a.x - b.x;
            return (a.isStart ? -a.height : a.height) - (b.isStart ? -b.height : b.height);
        });
        PriorityQueue<Integer> prio = new PriorityQueue<>((a, b) -> (b - a));
        int prevMax = 0;
        List<int[]> results = new ArrayList<>();
        prio.add(0);
        for (BuildingPoint p : points) {
            if (p.isStart) {
                prio.add(p.height);
            } else {
                prio.remove(p.height);
            }
            if (prevMax != prio.peek()) {
                results.add(new int[]{p.x, prio.peek()});
                prevMax = prio.peek();
            }
        }
        return results;
    }

}
