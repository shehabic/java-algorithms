package solutions;

import java.util.PriorityQueue;

public class FindSmallestKElements {

    public static void test() {
        FindSmallestKElements sut = new FindSmallestKElements();
        int[] sizes = new int[] {
            5,
            4,
            1,
            5
        };
        int[][] samples = new int[][]{
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {5, 10, 23, 1, -4, -5, 0, 10},
            {1, 2},
            {-5, 0, -10, -15, -17, -19}
        };
        int j = 0;
        for (int[] items: samples) {
            System.out.println("Input: (Select " + sizes[j] +") from ");
            for (int i: items)System.out.print(i + ",");
            System.out.println("\nOutput:");
            for (int i: sut.findSmallestElements(items,sizes[j]))System.out.print(i + ",");
            System.out.println("\n----------------\n");
            j++;
        }
    }

    public int[] findSmallestElements(int[] arr, int k) {
        int[] result = new int[k];
        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        for (int elem: arr) {
            q.add(elem);
        }
        for (int i = 0; i < k; i++) {
            result[i] = q.remove();
        }

        return result;
    }
}
