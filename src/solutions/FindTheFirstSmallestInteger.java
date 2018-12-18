package solutions;

import Utils.Printing;

public class FindTheFirstSmallestInteger {

    public static void test() {
        FindTheFirstSmallestInteger sut = new FindTheFirstSmallestInteger();
        int[][] samples = new int[][] {
            {1, 2, 3, 4},
            {0, 1, 4},
            {1, 2, 3, 5},
            {1, 1, 1},
            {2, 3, 4, 5, 6}
        };
        for (int[] sample: samples) {
            System.out.println("Given " + Printing.printArray(",", sample));
            System.out.println("The first missing positive integer is " + sut.firstMissingPositive(sample));
        }
    }

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }
        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
