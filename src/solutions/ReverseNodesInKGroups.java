package solutions;

public class ReverseNodesInKGroups {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int total = 0;
        ListNode current = head;
        ListNode last = null;
        ListNode first = null;
        ListNode next;
        ListNode lastTail = null;
        ListNode currentTail = null;
        while (current != null) {
            total++;
            current = current.next;
        }
        int groups = total / k;
        current = head;
        for (int i = 0; i < groups; i++) {
            int j = 0;
            while (j < k) {
                if (j == 0) currentTail = current;
                next = current.next;
                current.next = last;
                last = current;
                current = next;

                if (first == null && j == (k - 1)) {
                    first = last;
                }
                j++;
            }
            if (lastTail != null) {
                lastTail.next = currentTail;
            }
            lastTail = currentTail;
        }
        if (lastTail != null) {
            lastTail.next = current;
        }
        return first;
    }
}
