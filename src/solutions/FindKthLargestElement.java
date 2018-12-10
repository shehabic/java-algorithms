package solutions;

import Utils.Printing;

import java.util.PriorityQueue;

public class FindKthLargestElement {

    public static void test() {
        FindKthLargestElement sut = new FindKthLargestElement();
        int[][] elements = new int[][]{
            {1, 5, 2, 3, 4},
            {1, 1, 1, 5, 6},
            {-5, -4, -3, -2, -1}
        };
        int[] ks = new int[]{2, 4, 3};
        for (int i = 0; i < elements.length; i++) {
            System.out.println(
                "Kth: " + ks[i] + " largest element in " +
                    Printing.printArray(",", elements[i])
                    + " is " + sut.findKthLargest(elements[i], ks[i])
            );
        }
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> prio = new PriorityQueue<>(k, (a, b) -> b - a);
        for (int i : nums) prio.offer(i);
        int res = 0;
        for (int i = 0; i < k; i++) res = prio.poll();
        return res;
    }
}
