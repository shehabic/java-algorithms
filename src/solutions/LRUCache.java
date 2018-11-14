package solutions;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public static void test() {
        LRUCache cache = new LRUCache( 2 /* capacity */ );
//
//        cache.put(1, 1);
//        cache.put(2, 2);
//        System.out.println(cache.get(1));       // returns 1
//        cache.put(3, 3);    // evicts key 2
//        System.out.println(cache.get(2));       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        System.out.println(cache.get(1));       // returns -1 (not found)
//        System.out.println(cache.get(3));       // returns 3
//        System.out.println(cache.get(4));       // returns 4

        System.out.println("-------");
        cache = new LRUCache( 3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        System.out.println(cache.get(4));
        System.out.println(cache.get(3));
        System.out.println(cache.get(2));
        System.out.println(cache.get(1));
        cache.put(5, 5);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
        System.out.println(cache.get(5));

        // [4,3,2,-1, -1,2,3,-1,5];

    }

    private static class Node {
        Node top;
        Node bottom;
        int val;
        int key;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private final Map<Integer, Node> cache = new HashMap<Integer, Node>();
    private int capacity;
    private Node head = null;
    private Node tail = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        Node node = cache.get(key);
        moveToTop(node);
        return node.val;
    }

    private void moveToTop(Node node) {
        if (node == head)return;
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        if (node == tail) {
            tail = node.top;
            node.top.bottom = null;
        } else if (node.top != null) {
            node.top.bottom = node.bottom;
            node.bottom.top = node.top;
        }
        node.bottom = head;
        head.top = node;
        node.top = null;
        head = node;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.get(key).val = value;
            moveToTop(cache.get(key));
        } else {
            Node node = new Node(key, value);
            cache.put(key, node);
            moveToTop(node);
            if (cache.size() > capacity && tail != null) {
                int tailKey = tail.key;
                tail = tail.top;
                cache.remove(tailKey);

            }
        }
    }
}

