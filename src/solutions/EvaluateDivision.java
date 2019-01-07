package solutions;

import java.util.*;

public class EvaluateDivision {
    static class Mapped {
        String unit;
        double val;
        Mapped(String unit, double val) {
            this.unit = unit;
            this.val = val;
        }
    }

    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        Map<String, List<Mapped>> map = new HashMap<>();
        for (int i = 0; i < equations.length; i++) {
            add(equations[i][0], new Mapped(equations[i][1], values[i]), map);
            add(equations[i][1], new Mapped(equations[i][0], 1 / values[i]), map);
        }
        double[] res = new double[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Double result = find(queries[i][0], queries[i][1], map, new HashSet<>(), 1.0);
            res[i] = result != null ? result : -1.0;
        }
        return res;
    }

    private void add(String from, Mapped to, Map<String, List<Mapped>> map) {
        List<Mapped> mapped = map.getOrDefault(from, new ArrayList<>());
        mapped.add(to);
        map.put(from, mapped);
    }

    private Double find(String from, String to,Map<String, List<Mapped>> map, HashSet<String> visited, double val) {
        if (visited.contains(from) || !map.containsKey(from)) return null;
        if (from.equals(to)) return 1.0;
        for (Mapped mapped: map.get(from)) {
            if (mapped.unit.equals(to)) return mapped.val * val;
        }
        visited.add(from);
        for (Mapped mapped: map.get(from)) {
            Double found = find(mapped.unit, to, map, visited, val * mapped.val);
            if (found != null) return found;
        }
        return null;
    }
}
