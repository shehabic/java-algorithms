package solutions;

import Utils.Printing;

public class FindTheSmallestMissingInteger {

    public static void test() {
        FindTheSmallestMissingInteger sut = new FindTheSmallestMissingInteger();
        int[][] samples = new int[][]{
            {1, 2, 4},
            {1, 2, 4, 5},
            {1, 2, 3, 4, 5, 7},
            {2, 3, 4},
            {1, 2, 3, 4, 5, 6, 8, 9, 10},
            {1, 2, 3, 4, 5, 6, 7, 9, 10},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 19},
            {2, 3, 4, 6},
            {7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9}
        };
        for (int[] sample : samples) {
            System.out.println("For the set [" + Printing.printArray(",", sample) + "]");
            System.out.println("The missing number is " + sut.firstMissingPositive(sample));
            System.out.println("\n------------\n");

        }
    }

    public int firstMissingPositive(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int positives = 0;
        for (int num: nums) if (num > 0) {
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
            positives ++;
        }
        if (positives == (largest - smallest + 1)) {
            return smallest > 1 ? smallest - 1 : largest + 1;
        }
        int res = 0;
        for (int num: nums) if (num > 0) {
            res ^= num;
        }
        if (largest % 2 == 0) {
            res ^= largest + 1;
        }
        System.out.println("Res is " + res);
        if (smallest <= 1) return res;

        return (res > largest) ? smallest - 1 : res;
    }
}
