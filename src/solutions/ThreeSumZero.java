package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumZero {

    public static void test() {
        ThreeSumZero sut = new ThreeSumZero();
        int[][] samples = new int[][]{
            {-5, -5, -5, -4, -2, -1, 0, 2, 3, 5, 6, 9, 10},
            {-4, -1, -1, 0, 1, 3},
            {-4, -1, -1, 0},
            {-10, -5, -4, -1, 0, 3, 6, 8, 15},
        };
        for (int[] arr: samples) {
            System.out.println("Iterating over:\n");
            System.out.print(" [");
            for (int i = 0; i < arr.length; i++)System.out.print(i > 0 ? ", " + arr[i] : arr[i]);
            System.out.print("]\n");
            System.out.println("\nResult is:\n");
            List<List<Integer>> results = sut.threeSum(arr);
            if (results.size() == 0) System.out.println(" [None]");
            for (List<Integer> set: results) {
                System.out.print(" [");
                for (int i = 0; i < set.size(); i++)System.out.print(i > 0 ? ", " + set.get(i) : set.get(i));
                System.out.print("]\n");
            }
            System.out.println("\n-----------------------\n");
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int sum, start, end;
        // iterate the first element from 0 till the last element - 2, 2 is just to leave space for element 2 & 3
        for (int i = 0; i < nums.length - 2; i++) {
            // since we're looking for unique numbers, let's skip forward all similar items
            if (i > 0) {
                while (i < (nums.length - 2) && nums[i] == nums[i - 1]) i++; // avoid getting the same 3 numbers again
            }
            start = i + 1; // 2nd element is the one just after the first.
            end = nums.length - 1; // 3rd element for each iteration starts from the last element of the array
            while (start < end) { // keep looping until the 2 pointers the (left and right) meet each other.
                sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    while (start < end && nums[start] == nums[start - 1]) start++; // avoid getting the same 3 numbers again
                    end --;
                    while (end > start && nums[end] == nums[end + 1]) end--; // avoid getting the same 3 numbers again
                }
                if (sum > 0) end--;   // we can also fast forward similar values here, but it doesn't matter as long as the sum != 0
                if (sum < 0) start++; // we can also fast forward similar values here, but it doesn't matter as long as the sum != 0
            }
        }
        return result;
    }

}
