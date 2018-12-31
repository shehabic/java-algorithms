package solutions;

import java.util.*;

public class FindIntersectingArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] small;
        int[] big;
        if (nums1.length < nums2.length) {
            small = nums1;
            big = nums2;
        } else {
            small = nums2;
            big = nums1;
        }
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < small.length && j < big.length) {
            if (small[i] == big[j]) {
                res.add(small[i]);
                i++;
                j++;
            } else if (small[i] < big[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] output = new int[res.size()];
        for (int k = 0; k < output.length; k++) {
            output[k] = res.get(k);
        }
        return output;
    }

    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length > 0) {
            set.add(new ArrayList<>());
        }
        createSubsets(nums, 0, new ArrayList<Integer>());
        return new ArrayList<>(set);
    }

    private void createSubsets(int[] nums, int i, List<Integer> items) {
        if (i == nums.length) {
            set.add(new ArrayList<>(items));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            items.add(j);
            createSubsets(nums, i + 1, items);
            items.remove(items.size() - 1);
        }
    }
}
