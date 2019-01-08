package solutions;

import java.util.HashMap;
import java.util.Map;

public class MergeKLinkedLists {

    static public void test() {
        MergeKLinkedLists sut = new MergeKLinkedLists();
        int[][] inputs = new int[][]{{1,4,5},{1,3,4},{2,6}};
        ListNode[] nodes = new ListNode[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            nodes[i] = createNodes(inputs[i]);
        }
        ListNode results = sut.mergeKLists(nodes);
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

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return mergeKLists(lists, 0, lists.length - 1);
    }

    private ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start >= end) return lists[start];
        int mid = start + (end - start) / 2;
        ListNode first = mergeKLists(lists, start, mid);
        ListNode second = mergeKLists(lists, mid + 1, end);
        return mergeTwoLists(first, second);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }
}
