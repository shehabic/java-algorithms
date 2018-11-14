package solutions;

import java.util.ArrayList;
import java.util.List;

public class InsertNodeInTheRightPlace {
    private static List<LList> loops = new ArrayList();
    public static void test() {
        int[][] items = new int[][]{
            {1, 5, 6, 7, 8, 10, 15, 20},
            {1, 5, 5, 5, 10},
            {20, 20, 20, 20, 20},
            {1, 1, 1, 1, 1},
            {9, 10},
            {9, 9},
        };
        for (int[] list: items) {
            LList head = new LList(list[0]);
            LList current = head;
            boolean first = true;
            for (int item: list) {
                if (first) {
                    first = false;
                    continue;
                }
                current.next = new LList(item);
                current = current.next;
            }
            current.next = head;
            loops.add(current);
        }
        insert(9);
    }

    public static void insert(int item) {
        for (LList loopNode: loops) {
            insert(item, loopNode);
        }
        System.out.println(loops);
    }

    private static void insert(int item, LList loopNode) {
        LList current = loopNode.next;
        while (current != loopNode) {
            if (current.val <= item && current.next.val >= item) break;
            current = current.next;
        }
        LList newItem = new LList(item);
        newItem.next = current.next;
        current.next = newItem;
    }

    private static class LList {
        private final int val;
        LList next = null;

        private LList(int val) {
            this.val = val;
        }
    }
}
