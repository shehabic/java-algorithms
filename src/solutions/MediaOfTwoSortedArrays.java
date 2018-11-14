package solutions;

import java.util.ArrayList;
import java.util.List;

public class MediaOfTwoSortedArrays {

    public static void test() {
        System.out.println("Res is : " + findMedianSortedArrays(new int[]{1, 3}, new int[]{5, 5}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mids = findMidArray(nums1, nums2);
        int sum = 0;
        for (int val : mids) sum += val;

        return (double) sum / mids.size();
    }

    public static List<Integer> findMidArray(int[] nums1, int[] nums2) {
        int max = nums1.length + nums2.length;
        List<Integer> mid = new ArrayList<>();
        int p1 = 0, p2 = 0, index = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            int val;
            if (nums1[p1] < nums2[p2]) {
                val = nums1[p1];
                p1++;
            } else {
                val = nums2[p2];
                p2++;
            }
            if (isMiddle(max, index)) {
                mid.add(val);
            }
            index++;
        }
        while (p2 < nums2.length) {
            if (isMiddle(max, index)) {
                mid.add(nums2[p2]);
            }
            index++;
            p2++;
        }
        while (p1 < nums1.length) {
            if (isMiddle(max, index)) {
                mid.add(nums1[p1]);
            }
            index++;
            p1++;
        }

        return mid;
    }

    static boolean isMiddle(int total, int index) {
        boolean even = total % 2 == 0;
        return (even && (index == (total / 2) || index == (total / 2 - 1)))
            || (!even && index == total / 2 && index % 2 == 1);
    }
}
