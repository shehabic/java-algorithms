package solutions;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseInteger {
    public static void test() {
        System.out.println("Reve. 123 is " + reverse(123));
        System.out.println("Reve. 554 is " + reverse(554));
        System.out.println("Reve. 76543 is " + reverse(76543));
    }
    public static int reverse(int x) {
        Queue<Integer> queue = new LinkedList<>();
        while (x != 0) {
            queue.offer(x % 10);
            x = x / 10;
        }
        double result = 0;
        double loop = Math.pow(10, queue.size() - 1);
        while (!queue.isEmpty()) {
            result = result + (loop * queue.poll());
            loop = loop / 10;
        }
        return (int) result > Integer.MAX_VALUE - 1 || result < Integer.MIN_VALUE ? 0 : (int) result;
    }
}
