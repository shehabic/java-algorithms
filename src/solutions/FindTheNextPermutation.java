package solutions;

import Utils.Printing;

public class FindTheNextPermutation {

    public static void test() {
        int[][] samples = new int[][] {
            {1, 2, 5, 4, 3, 2},
            {5, 4, 3, 2, 1},
            {1, 1, 1, 1},
            {},
            {1, 9, 8, 7, 6}
        };
        FindTheNextPermutation sut = new FindTheNextPermutation();
        for (int[] sample: samples) {
            System.out.println("Given [" + Printing.printArray(", ", sample) + "]");
            sut.nextPermutation(sample);
            System.out.println("Outut is [" + Printing.printArray(", ", sample) + "]");
        }
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0) {
            if (nums[i] < nums[i + 1]) break;
            i--;
        }
        if (i >= 0) {
            int j = i;
            while (j < nums.length - 1) {
                if (nums[j + 1] <= nums[i]) {
                    swap(nums, i, j);
                    break;
                } else if (j == nums.length - 2) {
                    swap(nums, i, j + 1);
                }
                j++;
            }
        }
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int s) {
        int l = s, r = nums.length - 1;
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
