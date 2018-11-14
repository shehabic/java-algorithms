package solutions;

public class MountainPeakArray {
    public static void test() {
        int[][] arrays = new int[][] {
            {0, 2, 4, 6, 8, 9, 4, 2, 1},
            {0, 2, 1},
            {2, 4, 6, 8, 1},
            {0, 2, 4, 2, 1},
        };
        for (int[] arr: arrays) {

            for (int i : arr) System.out.print(i + " -> ");
            System.out.println(": mountain peak at " + peakIndexInMountainArray(arr));
        }
    }

    public static int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (A[mid] < A[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
