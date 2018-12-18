package solutions;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutationsOfArray {

    public static void test() {
        FindAllPermutationsOfArray sut = new FindAllPermutationsOfArray();
        int[][] samples = new int[][] {
            {1, 2, 3},
            {5, 6, 1, 2}
        };
        List<List<Integer>> res;
        for (int[] sample: samples) {
            res = sut.permute(sample);
            System.out.println(res);
            System.out.println("\n");
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(res, new ArrayList<>(), nums);
        return res;
    }

    private void permute(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            // here we create a new list (clone) otherwise changes to the temp array later will impact the same object
            // that was added to the result;
            res.add(new ArrayList<>(temp));
        }
        for (int num : nums) {
            if (!temp.contains(num)) {
                temp.add(num);
                permute(res, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }

}
