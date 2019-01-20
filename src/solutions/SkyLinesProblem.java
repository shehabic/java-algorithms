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
        TreeMap<Integer, Integer> tree = new TreeMap<>((a, b) -> (b - a));
        int prevMax = 0;
        List<int[]> results = new ArrayList<>();
        tree.put(0, 1);
        for (BuildingPoint p : points) {
            if (p.isStart) {
                tree.put(p.height, tree.getOrDefault(p.height, 0) + 1);
            } else {
                tree.put(p.height, tree.get(p.height) - 1);
                if (tree.get(p.height) == 0) tree.remove(p.height);
            }
            if (prevMax != tree.lastKey()) {
                results.add(new int[]{p.x, tree.lastKey()});
                prevMax = tree.lastKey();
            }
        }

        return results;
    }

}
