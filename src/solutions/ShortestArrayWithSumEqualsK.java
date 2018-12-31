package solutions;

import Utils.Printing;

import java.util.Deque;
import java.util.LinkedList;

public class ShortestArrayWithSumEqualsK {

    public static void test() {
        ShortestArrayWithSumEqualsK sut = new ShortestArrayWithSumEqualsK();
        int[][] samples = new int[][]{
            {-34, 37, 51, 3, -12, -50, 51, 100, -47, 99, 34, 14, -13, 89, 31, -14, -44, 23, -38, 6},
            {84, -37, 32, 40, 95},
            {1, 2},
            {17, 85, 93, -45, -21},
            {1, 2, 3, -4, 5, -10, 2, 4, -1, 4},
            {1, 1, 1, 1, 1},
            {2, 5, -9, 3, 4, -2, 3, 4},
            {0, 1, 0, 1, 1, 2, 4, 0}
        };
        int[] k = new int[]{
            151, 167, 4, 150, 7, 1, 10, 4
        };
        int i = 0;
        for (int[] sample : samples) {
            System.out.println("\n\n\nFor the sample [" + Printing.printArray(",", sample) + "]");
            System.out.println("K is " + k[i]);
            System.out.println("The result is: " + sut.shortestSubarray(sample, k[i]));
            i++;
        }

    }

    public int shortestSubarray2(int[] A, int K) {
        int N = A.length;
        long[] P = new long[N + 1];
        for (int i = 0; i < N; ++i)
            P[i + 1] = P[i] + (long) A[i];

        // Want smallest y-x with P[y] - P[x] >= K
        int ans = N + 1; // N+1 is impossible
        Deque<Integer> monoq = new LinkedList(); //opt(y) candidates, as indices of P

        for (int y = 0; y < P.length; ++y) {
            // Want opt(y) = largest x with P[x] <= P[y] - K;
            while (!monoq.isEmpty() && P[y] <= P[monoq.getLast()])
                monoq.removeLast();
            while (!monoq.isEmpty() && P[y] >= P[monoq.getFirst()] + K)
                ans = Math.min(ans, y - monoq.removeFirst());

            monoq.addLast(y);
        }

        return ans < N + 1 ? ans : -1;
    }

    public int shortestSubarray(int[] A, int K) {
        // Initialize current sum and minimum length
        int currSum = 0, min = A.length + 1;

        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < A.length) {

            while (currSum < K && end < A.length) {
                if (currSum + A[end] < 0) {
                    start = end + 1;
                    currSum = 0;
                } else {
                    currSum += A[end];
                }
                end++;

            }

            // If current sum becomes greater than x.
            while (currSum >= K && start < A.length) {
                // Update minimum length if needed
                if (end - start < min) {
                    min = end - start;
                }
                currSum -= A[start];
                start++;
                while (start < A.length && A[start] <= 0) currSum -= A[start++];
            }
        }

        if (min < 0) return -1;
        return min == A.length + 1 ? -1 : min;
    }
}
