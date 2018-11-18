package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLinkedList {

    public static void test() {
        List<List<Integer>> nodes = new ArrayList<>();
        nodes.add(Arrays.asList(1, 2, 3, 4, 5));
        nodes.add(Arrays.asList(1, 2));
        nodes.add(Arrays.asList(1));
        nodes.add(Arrays.asList());
        ReverseLinkedList sut = new ReverseLinkedList();

        for (List<Integer> items: nodes) {
            ListNode node = buildList(items);
            System.out.println("\nInput:");
            items.forEach(i -> System.out.print(" -> " + i));
            ListNode result = sut.reverseList(node);
            System.out.println("\nOutput:");
            while (result != null) {
                System.out.print(" -> " + result.val);
                result = result.next;
            }
            System.out.println("\n------------------------");
        }
    }

    private static ListNode buildList(List<Integer> items) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        for (int i: items) {
            current.next = new ListNode(i);
            current = current.next;
        }
        return head.next;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode last = null;
        ListNode next = null;
        while(current != null) {
            next = current.next;
            current.next = last;
            last = current;
            current = next;
        }
        return last;
    }
}
