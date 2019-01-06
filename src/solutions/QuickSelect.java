package solutions;

import Utils.Printing;

import java.util.Random;

public class QuickSelect {

    public static void test() {
        int[][] samples = new int[][] {
            {5, 9, 8,  2, -2, 3, 4, 10, 11, 15 ,-3},
            {1, 2, 3, 4, 5, 6, 7},
            {5, 4, 3, 2, 9, 8, 7, 5}
        };
        int[] k = new int[]{ 4, 6, 7};
        QuickSelect sut = new QuickSelect();
        for (int i = 0; i < samples.length; i++) {
            System.out.println("For input [" + Printing.printArray(",", samples[i]) + "] , " + k[i] + "th Smallest ");
            System.out.println("The result is : " + sut.findSmallestKElement(samples[i], k[i] - 1));
            System.out.println("For input [" + Printing.printArray(",", samples[i]) + "] , " + k[i] + "th Largest ");
            System.out.println("The result is : " + sut.findLargestKthElement(samples[i], k[i]));
            System.out.println("\n----------------------\n");
        }
    }

    public int findLargestKthElement(int[] nums, int k) {
        return findElement(nums, 0, nums.length - 1, nums.length - k);
    }

    public int findSmallestKElement(int[] nums, int k) {
        return findElement(nums, 0, nums.length - 1, k);
    }

    private int findElement(int[] nums, int left, int right, int k) {
        int start = left;
        int pivot = getPivot(left, right);
        swap(nums, pivot, right);
        for (int i = left; i < right; i++) {
            if (nums[i] <= nums[right]) {
                swap(nums, start++, i);
            }
        }
        swap(nums, start, right);
        if (start == k) return nums[k];
        if (k < start) return findElement(nums, left, start - 1, k);
        return findElement(nums, start + 1, right, k);
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    private int getPivot(int start, int end) {
        return start + new Random().nextInt(end - start + 1);
    }
}
