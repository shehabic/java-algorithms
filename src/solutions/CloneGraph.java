package solutions;

import java.util.*;

public class CloneGraph {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        UndirectedGraphNode current;
        LinkedList<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            current = queue.remove();
            UndirectedGraphNode cloned = cloneOrGet(current.label, map);
            for (UndirectedGraphNode child : current.neighbors) {
                if (!map.containsKey(child.label)) {
                    queue.add(child);
                    cloneOrGet(child.label, map);
                }
                cloned.neighbors.add(cloneOrGet(child.label, map));
            }
        }

        return map.get(node.label);
    }

    private UndirectedGraphNode cloneOrGet(int label, Map<Integer, UndirectedGraphNode> map) {
        if (!map.containsKey(label)) map.put(label, new UndirectedGraphNode(label));
        return map.get(label);
    }

    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<>();
        }
    }
}
