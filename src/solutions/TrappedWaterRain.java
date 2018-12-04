package solutions;

import Utils.Printing;

public class TrappedWaterRain {

    public static void test() {
        TrappedWaterRain sut = new TrappedWaterRain();
        Integer[][] samples = new Integer[][]{
            {0,1,0,2,1,0,1,3,2,1,2,1},
            {0, 1, 1, 0, 0, 1, 3, 0, 1, 0, 2, 0, 1, 0, 1},
            {0, 1, 1, 0, 0, 1, 3, 0, 1, 0, 2, 0, 1, 0, 3},
        };
        for (Integer[] sample : samples) {
            System.out.println("For array " + Printing.printArray(", ", sample) + "  Output: " + sut.trap(sample));
        }
    }

    public int trap(Integer[] height) {
        if (height.length < 2) return 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            total += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return total;
    }
}
