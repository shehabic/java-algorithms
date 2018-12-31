package solutions;

import Utils.Printing;

import java.util.*;

public class AlienDictionary {

    public static void test() {
        AlienDictionary sut = new AlienDictionary();
        String[][] samples = new String[][]{
            {"wrt", "wrf", "xrr", "xrg", "gpc", "gph"},
            {"wrt", "wrf", "er", "ett", "rftt"},
            {
                "bsusz",
                "rhn",
                "gfbrwec",
                "kuw",
                "qvpxbexnhx",
                "gnp",
                "laxutz",
                "qzxccww"
            }
        };
        for (String[] words: samples) {
            System.out.println("\n\n\nFor the input: [" + Printing.printArray(", ", words)+"]");
            System.out.println("Order is: " + sut.alienOrder(words));
        }
    }


    private Map<Character, Set<Character>> graph = new HashMap<>();
    private Map<Character, Integer> levels = new HashMap<>();

    public String alienOrder(String[] words) {
        graph.clear();
        levels.clear();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                levels.put(c, 0);
            }
        }
        String parent, child;
        for (int i = 1; i < words.length; i++) {
            parent = words[i - 1];
            child = words[i];
            int max = Math.min(parent.length(), child.length());
            for (int j = 0; j < max; j++) {
                if (parent.charAt(j) != child.charAt(j)) {
                    if (!addChildChar(parent.charAt(j), child.charAt(j))) return "";
                    break;
                }
            }
        }
        String result = getOrder();
        return result.length() != levels.size() ? "" : result;
    }

    private String getOrder() {
        LinkedList<Character> queue = new LinkedList<>();
        for (Character c : levels.keySet()) {
            if (levels.get(c) == 0) queue.add(c);
        }
        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            Character c = queue.remove();
            result.append(c);
            for (Character child: graph.getOrDefault(c, new HashSet<>())) {
                levels.put(child, levels.get(child) - 1);
                if (levels.get(child) == 0) queue.add(child);
            }
        }
        return result.toString();
    }

    private boolean addChildChar(char parent, char child) {
        Set<Character> children = graph.getOrDefault(parent, new HashSet<>());
        if (!children.contains(child)) {
            children.add(child);
            graph.put(parent, children);
            levels.put(child, levels.get(child) + 1);
            return !graph.getOrDefault(child, new HashSet<>()).contains(parent);
        }
        return true;
    }

}
