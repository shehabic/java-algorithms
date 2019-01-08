package solutions;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFromDataStream {
    PriorityQueue<Integer> minH = new PriorityQueue<>();
    PriorityQueue<Integer> maxH = new PriorityQueue<>(Collections.reverseOrder());

    public void addNum(int num) {
        maxH.add(num);
        minH.add(maxH.poll());
        if (minH.size() > maxH.size()) {
            maxH.add(minH.poll());
        }
    }

    public double findMedian() {
        if (minH.size() == maxH.size())
            return (double) (maxH.peek() + minH.peek()) * 0.5;
        else
            return (double) maxH.peek();
    }
}
