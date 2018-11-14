package solutions;

import java.util.HashMap;
import java.util.Map;

public class MergeKLinkedLists {

    static public void test() {
        int[][] inputs = new int[][]{{1,4,5},{1,3,4},{2,6}};
        ListNode[] nodes = new ListNode[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            nodes[i] = createNodes(inputs[i]);
        }
        ListNode results = mergeKLists(nodes);
        System.out.println(results);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode createNodes(int[] inputs) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        for (int val: inputs) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return result.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        int count = lists.length;
        ListNode result = new ListNode(0);
        ListNode current = result;
        ListNode[] pointers = new ListNode[count];
        int min;
        int smallest = 0;
        for (int i = 0; i < count; i++) pointers[i] = lists[i];
        while (stillHasItems(pointers)) {
            min = Integer.MAX_VALUE;
            for (int i = 0; i < count; i++) {
                if (pointers[i] != null && pointers[i].val <= min) {
                    smallest = i;
                    min = pointers[i].val;
                }
            }
            current.next = pointers[smallest];
            current = current.next;
            pointers[smallest] = pointers[smallest].next;
        }

        return result.next;
    }

    static boolean stillHasItems(ListNode[] pointers) {
        Map<String, Integer> x = new HashMap<>();
        for (ListNode node : pointers) {
            if (node != null) {
                return true;
            }
        }
        return false;
    }
}
