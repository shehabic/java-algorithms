package solutions;

import Utils.Printing;

import java.util.Arrays;

public class MaximumSumSubArrays {

    public static void test() {
        MaximumSumSubArrays sut = new MaximumSumSubArrays();
        int[][] samples = new int[][]{
            {3, 2, 1, 10, 5, 1, 2, 16, 9, 10, 4, 5, 7},
            {4, 5, 10, 6, 11, 17, 4, 11, 1, 3},
            {7, 13, 20, 19, 19, 2, 10, 1, 1, 19},
            {1, 3, 4, 5, 6, 7, 10, 2, 3, 4, 7, 9, 3, 5, 6, 7},
            {2, 3, 0, 1, 2, 7, 0, 4, 5},
            {1, 2, 1, 2, 6, 7, 5, 1}
        };
        int[] k = new int[]{3, 1, 3, 3, 2, 2};
        int i = 0;
        for (int[] sample : samples) {

            System.out.println("Input array: [" + Printing.printArray(sample) + "]");
            int[] res = sut.maxSumOfThreeSubarrays(sample, k[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println(
                    res[j] + " - [" + Printing.printArray(Arrays.copyOfRange(sample, res[j], res[j] + k[i])) + "]"
                );
            }
            i++;
            System.out.println("\n---------\n");
        }
    }

    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] sum = new int[n - k + 1];
        for (int i = 0; i < k; i++) sum[0] += nums[i];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i + k - 1] - nums[i - 1];
        }

        int best = 0;
        for (int i = 0; i < n - 2 * k; i++) {
            if (sum[i] > sum[best]) best = i;
            left[i] = best;
        }

        best = n - k;
        for (int i = n - k; i >= k; i--) {
            if (sum[i] >= sum[best]) best = i;
            right[i] = best;
        }
        System.out.println("Sum: " + Printing.printArray(sum));
        System.out.println("Left: " + Printing.printArray(left));
        System.out.println("Right: " + Printing.printArray(right));
        int[] res = new int[]{-1, -1, -1};

        for (int i = k; i <= n - 2 * k; i++) {
            if (res[0] == -1 || sum[res[0]] + sum[res[1]] + sum[res[2]] < sum[left[i - k]] + sum[i] + sum[right[i + k]]) {
                res[0] = left[i - k];
                res[1] = i;
                res[2] = right[i + k];
            }
        }
        return res;
    }
}
