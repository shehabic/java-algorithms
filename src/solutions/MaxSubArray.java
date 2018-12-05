package solutions;

import Utils.Printing;

public class MaxSubArray {

    public static void test() {
        MaxSubArray sut = new MaxSubArray();
        int[] sample = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max sub array in " + Printing.printArray(",", sample) + " IS: " + sut.maxSubArray(sample));
    }

    public int maxSubArray(int[] nums) {
        int[] sums = new int[nums.length + 1];
        sums[0] = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= nums.length; i++) {
            sums[i] = Math.max(sums[i - 1] + nums[i - 1], nums[i - 1]);
            if (sums[i] > max) {
                max = sums[i];
            }
        }

        return max;
    }
}
