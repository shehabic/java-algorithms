// test ID: 23280669503560

import com.sun.tools.javac.util.Pair;
import solutions.*;

import java.util.*;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
//        CDPath.test();
//        NumberToString.test();
//        TrieWithWildCardSearch.test();
//        InsertNodeInTheRightPlace.test();
//        Zerofy.test();
//        LongestUniqueSequence.test();
//        MediaOfTwoSortedArrays.test();
//        ReverseInteger.test();
//        MountainPeakArray.test();
//        MergeKLinkedLists.test();
//        WordLadder.test();
//        ClosesPalindrome.test();
//        LRUCache.test();
//        NumbersIsland.test();
//        TrieOptimized.test();
//        NumToEnglishBlind.test();
//        RemoveBadParentheses.test();
//        ValidateParentheses.test();
//        GenerateBraces.test();
//        LettersCombinationsOfPhoneNumber.test();
//        ThreeSumZero.test();
//        RomanToDecimals.test();
//        MergeOverlappingIntervals.test();
//        ReverseLinkedList.test();
//        FindMinimumNumberOfRoomsForMeetings.test();
//        CanWeRemoveOneCharToMakeItPalindrome.test();
//        WordBreak.test();
//        RespaceWords.test();
//        FindSmallestKElements.test();
//        TrappedWaterRain.test();
//        MaxSubArray.test();
//        MinWindow.test();
//        LargestRectInHistogram.test();
//        FindLargestRectangleInMatrix.test();
//        CountPalindromicSubstrings.test();
//        FindKthLargestElement.test();
//        GroupAnagrams.test();
//        RegexMatchDP.test();
//        CheckForPalindromeNumbers.test();
//        NextClosesTimeSlot.test();
//        ReformatLicenceKey.test();
//        FindTheNextPermutation.test();
//        FindAllPermutationsOfArray.test();
//        LongestSubstringWithTwoDistincts.test();
//        NearestPalindrome.test();
//        FindTheSmallestMissingInteger.test();
//        FindTheFirstSmallestInteger.test();
//        ShortestArrayWithSumEqualsK.test();
        AlienDictionary.test();
//        FindTheFirstSmallestInteger.test();
        exit(0);
//        System.out.print(Arrays.asList("d", "g").indexOf(null) > -1);
//
//        PriorityQueue<Integer> n = new PriorityQueue<>(10);
//        n.add(1);
//        n.add(2);
//        n.add(3);
//        n.add(4);
//        n.add(5);
//        n.add(6);
//        n.add(7);
//        n.add(8);
//        n.add(9);
//        n.add(10);
//        System.out.print("N Peek is " + n.peek() + " N remove " + n.remove() + "\n");
//        System.out.println(Decoder.decode("3[a2[b3[X]d]g4[ef2[z]]h]"));
//        moveNonZeros();
//         int [] arr = new int[]{0,2,3,4,1,5};
//         int pos = AmazingNumbersBestPosition.findStartingPosition(arr);
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//        System.out.print("Pos " + pos);
//        printSums(10, 15, 55);
//        ReverseTree.run();
//            findIntervals.findIntervals();
//        PermutateMultiWords.permutate();
        kthLargest(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 6);
//        List<Integer> i = getAnagramIndices("bbbababaaabbbb", "ab");
//        System.out.println(i);
//        palindrome();
//        blabla();
//          int result = insertBits(0b11011111001, 0b10011, 2, 6);
//          System.out.println("Output is " + Integer.toBinaryString(result));
//
//          System.out.println("Ways are : " + countWays2(30));
//        String x = "zghkalvb";
//        char[] x2 = x.toCharArray();
//        x = new String(x2);
//        System.out.println("Sorted " + x);
//        StairCase(6);
//        int[] arr = new int[]{1, 10, 15, -5, -4, -2, 13, 7, 8, 2, -1, -3, -6, -9, 6, 9, 10, 11};
//        Arrays.sort(arr);
//        HashSet<String> output = new HashSet<String>();
//        threeSumZero(arr, output);
//        for (String s : output) {
//            System.out.println(s);
//        }

//
//        List<String> words = listAllChars(34);
//        System.out.println(words.toString());
//
//        List<String> words2 = listAllChars(1348);
//        System.out.println(words2.toString());
//
//        List<String> words3 = listAllChars(13042823);
//        Collections.sort(words3, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        System.out.println(words3.toString());
//        int[] array = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
//        int search = 5;
//        int position = searchInSortedRotatedArray(array, search, 0, array.length - 1);
//        System.out.println(String.format("Element with value %d found at position %d", search, position));
//        List<String> sets = parents(4);
//        System.out.println("Sets size " + sets.size());
//        System.out.println(sets.toString());

//        System.out.print("Counts 4 = " + countSteps(3));
//        System.out.print("Counts 4 = " + countWays(3));
//
//        SortedStack stack = new SortedStack();
////        Integer[] list = {5, 3, 6, 2, 1, 8, 4, 3, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1};bv
//        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(String.format("Input: N = %d", list.length));
//        for (Integer i : list) {
//            stack.push(i);
//            System.out.print(String.format("%d ", i));
//        }
//
//        System.out.println("Output:");
//        while (!stack.isEmpty()) {
//            System.out.print(String.format("%d ", stack.pop()));
//        }
//        System.out.println(String.format("Runtime: O(%d)", loops));
//        prepareIntervals();
//        sortSquareArray();
//        findBest();
//            subArrayWithSum();
//        testAddingToArray();
//        HashMap<String , String> map = new HashMap<>();
//        addUrl(map, "http://www-st.foodora.com.au/api/v5/abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ12345678910");
//        System.out.println(map.toString());
    }


    private static int loops = 0;

    public static int countSteps(int n) {
        int[] mem = new int[n + 1];
        Arrays.fill(mem, -1);
        return countSteps(n, mem);
    }

    public static int countSteps(int n, int counts[]) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (counts[n] > -1) {
            return counts[n];
        }
        counts[n] = countSteps(n - 1, counts) + countSteps(n - 2, counts) + countSteps(n - 3, counts);

        return counts[n];
    }

    static int countWays(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countWays(n, memo);
    }


    static int countWays(int n, int[] memo) {

        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
            return memo[n];
        }
    }

    public static int searchInSortedRotatedArray(int[] array, int search, int start, int end) {
        int mid = (start + end) / 2;
        if (array[mid] == search) {
            return mid;
        }
        if (inHalf(array, start, mid - 1, search)) {
            return searchInSortedRotatedArray(array, search, start, mid - 1);
        }
        if (inHalf(array, mid + 1, end, search)) {
            return searchInSortedRotatedArray(array, search, mid + 1, end);
        }

        return -1;
    }

    private static boolean inHalf(int[] array, int start, int end, int search) {
        boolean isRotated = array[start] > array[end];

        return (array[start] >= search && array[end] >= search && isRotated)
            || (!isRotated && array[start] <= search && array[end] >= search);
    }

    public static List<String> listAllChars(int num) {
        /**
         *
         Given a number x and a map of list of chars print all possible decoded strings
         Input: 34, {3:[A,B], 4:[V, M, X], 8:[], 1:[W,X]}
         Output: AV, AM,AX, BV, BM, BX
         *
         */
        HashMap<Integer, List<Character>> map = new HashMap<>();
        map.put(1, Arrays.asList('X', 'W'));
        map.put(3, Arrays.asList('A', 'B'));
        map.put(4, Arrays.asList('V', 'M', 'X'));
        map.put(8, new ArrayList<Character>());

        return findAllCombinations(num, map, "");
    }

    private static List<String> findAllCombinations(int num, HashMap<Integer, List<Character>> map, String suffix) {
        List<String> result = new ArrayList<>();
        if (num > 0) {
            int number = num % 10;
            num /= 10;
            if (map.containsKey(number) && map.get(number).size() > 0) {
                for (Character c : map.get(number)) {
                    result.addAll(findAllCombinations(num, map, c + suffix));
                }
            } else {
                result.addAll(findAllCombinations(num, map, suffix));
            }
        } else {
            result.add(suffix);
        }

        return result;
    }


    static void threeSumZero(int[] array, HashSet<String> values) {
        Arrays.sort(array); // O(n*log n)
        int n = array.length;
        int a, b, c, sum, start, end;

        for (int i = 0; i < n - 2; i++) {
            a = array[i];
            start = i + 1;
            end = n - 1;
            while (start < end) {
                b = array[start];
                c = array[end];
                sum = a + b + c;
                if (sum == 0) {
                    values.add("a: " + a + ", b: " + b + ", c: " + c);
                    break;
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
    }

    static void StairCase(int n) {
        String spaces = " ";
        for (int i = 1; i < n; i++) {
            spaces += " ";
        }
        String hashes = "#";
        while (n > 0) {
            System.out.println(spaces + hashes);
            hashes += "#";
            spaces = spaces.substring(1);
            n--;
        }
    }

    public static List<Integer> getAnagramIndices(String haystack, String needle) {
        // WRITE YOUR CODE HERE
        List<String> perms = new ArrayList<String>();
        generatePermutations("", needle, perms);
        List<Integer> results = new ArrayList<Integer>();
        int substrFrom = 0;
        for (String str : perms) {
            String tmp = haystack;
            while (substrFrom > -1) {
                int position = tmp.substring(substrFrom).lastIndexOf(str);
                if (position > -1) {
                    results.add(position);
                    tmp = tmp.substring(0, position);
                } else {
                    break;
                }
            }
        }
        Collections.sort(results);

        return results;
    }

    private static void generatePermutations(String prefix, String str, List<String> perms) {
        int n = str.length();
        if (n == 0) {
            perms.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), perms);
            }
        }
    }

    public static class SortedStack extends MyStack<Integer> {
        private MyStack<Integer> sortedStack = new MyStack<Integer>();
        private MyStack<Integer> temp = new MyStack<Integer>();

        @Override
        public Integer pop() {
            return sortedStack.pop();
        }

        @Override
        public void push(Integer val) {
            while (!sortedStack.isEmpty() && sortedStack.peek() < val) {
                loops++;
                temp.push(sortedStack.pop());
            }
            sortedStack.push(val);
            while (!temp.isEmpty()) {
                loops++;
                sortedStack.push(temp.pop());
            }
            LinkedList<String> str = new LinkedList<>();
        }

        @Override
        public Integer peek() {
            return sortedStack.peek();
        }

        @Override
        public boolean isEmpty() {
            return sortedStack.isEmpty();
        }
    }

    public static class MyStack<T> {
        private static class StackNode<T> {
            private T data;
            private StackNode<T> next;

            public StackNode(T data) {
                this.data = data;
            }

            public T getData() {
                return data;
            }
        }

        private StackNode<T> top;

        public T pop() {
            if (top == null) throw new EmptyStackException();
            T item = top.getData();
            top = top.next;
            return item;
        }

        public void push(T item) {
            StackNode<T> t = new StackNode<>(item);
            t.next = top;
            top = t;
        }

        public T peek() {
            if (top == null) throw new EmptyStackException();
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    private static void printValues(Integer[][] matrix) {
        System.out.print("\nOutput:\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static class CompareBinaryToHex {

        public static int digitToValue(char c) {
            if (c >= '0' && c <= '9') {
                return c - '0';
            } else if (c >= 'A' && c <= 'F') {
                return 10 + c - 'A';
            } else if (c >= 'a' && c <= 'f') {
                return 10 + c - 'a';
            }
            return -1;
        }

        public static int convertFromBase(String number, int base) {
            if (base < 2 || (base > 10 && base != 16)) return -1;
            int value = 0;
            for (int i = number.length() - 1; i >= 0; i--) {
                int digit = digitToValue(number.charAt(i));
                if (digit < 0 || digit >= base) {
                    return -1;
                }
                int exp = number.length() - 1 - i;
                value += digit * Math.pow(base, exp);
            }
            return value;
        }

        public static boolean compareBinToHex(String binary, String hex) {
            int n1 = convertFromBase(binary, 2);
            int n2 = convertFromBase(hex, 16);
            if (n1 < 0 || n2 < 0) {
                return false;
            }
            return n1 == n2;
        }
        // 1001  1 * Math.pow(2, 0)

        public static void main(String[] args) {
            System.out.println(compareBinToHex("111001011", "1CB"));
        }

    }

    /*

    Insertion: You are given two 32-bit numbers, Nand M, and two bit positions, i and j. Write a method
    to insert Minto N such that M starts at bit j and ends at bit i. You can assume that the bits j through
    i have enough space to fit all of M. That is, if M = 18811, you can assume that there are at least 5
    bits between j and i. You would not, for example, have j = 3 and i = 2, because M could not fully
    fit between bit 3 and bit 2.
    EXAMPLE

    Input:  N = 10000000000, M = 10011, i = 2, j = 6
    Output: N = 10001001100
     */

    public static int flipToWin(int sequence) {
        int seq = sequence;
        int max = 0;
        int last = 0;
        boolean foundZero = true;
        int currentSequence = 0;
        while (seq > 0) {
            if ((seq & 1) == 1) {
                last = 1;
                currentSequence++;
            } else {
                if (last == 0) {
                    max = Math.max(max, currentSequence);
                    currentSequence = 0;
                } else {
                    currentSequence++;
                }
                foundZero = true;
            }
            seq >>= 1;
        }

        return max;
    }


    public static int insertBits(int n, int m, int i, int j) {
        int left = (~0) << (j + 1);
        int right = 0;
        m = (m << i);
        while (i-- > 0) {
            right = (right << 1) + 1;
        }
        left = left | right;

        return (n & left) | m;
    }

//    public TreeNode createTreeNodes(int[] arr, int start, int end) {
//        if (end < start) {
//            return null;
//        }
//        int mid = (end + start) / 2;
//        TreeNode node = new TreeNode(arr[mid]);
//        node.setLeftChild(createTreeNodes(arr, start, mid -1));
//        node.setRightChild(createTreeNodes(arr, mid + 1, end));
//
//        return node;
//    }

    public static int countWays2(int n) {
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);

        return countWays2(n, ways);
    }

    public static int countWays2(int n, int[] ways) {
        if (n < 0) {
            return 0;
        } else if (n < 1) {
            return 1;
        } else if (ways[n] > -1) {
            return ways[n];
        } else {
            System.out.println("Here: " + n);
            ways[n] = countWays2(n - 1, ways) + countWays2(n - 2, ways) + countWays2(n - 3, ways);

            return ways[n];
        }
    }

//    public boolean isValidBST(Node node) {
//        return isValidBST(node, null, null);
//    }
//
//    private boolean isValidBST(Node node, Integer min, Integer max) {
//        if (node == null) {
//            return true;
//        }
//
//        if ((min != null && min <= node.data) || (max != null && max > node.data)) {
//            return false;
//        }
//
//        return isValidBST(node.left, min, node.left.data) && isValidBST(node.right, node.right.data, max);
//    }

    private static class TNode {
        public TNode next;
        public int data;

        public TNode(int data) {
            this.data = data;
        }
    }

    public static TNode jumble(TNode node) {
        if (node == null || node.next == null) {
            return null;
        }
        TNode runner = node;
        while (runner != null) {
            System.out.println(String.format("->%d", runner.data));
            runner = runner.next;
        }
        TNode fast = node;
        TNode slow = node;
        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TNode old = slow;
        TNode current = slow.next;
        TNode end = slow.next != null ? slow.next.next : null;
        while (end != null) {
            current.next = old;
            old = current;
            current = end;
            end = end.next;
        }
        current.next = old;
        TNode result = node;
        TNode resultTail = result;
        while (node != current) {
            resultTail.next = node;
            node = node.next;
            resultTail = resultTail.next;
            resultTail.next = current;
            current = current.next;
            resultTail = resultTail.next;
        }
        resultTail.next = null;

        return result;
    }

    public static class Jumble {

        public Jumble() {
        }

        private class Node {
            Node(int val) {
                this.val = val;
            }

            int val;
            Node next;
        }

        private void connect(Node node) {
            //single node return;
            if (node.next == null || node.next.next == null) {
                return;
            }
            Node head = new Node(-1);
            head.next = node;
            Node prev = null;
            while (node.next != null) {
                prev = node;
                node = node.next;
            }
            Node second = head.next.next;
            node.next = second;
            head.next.next = node;
            prev.next = null;
        }

        private Node jumble(Node node) {
            Node head = new Node(-1);
            head.next = node;
            do {
                connect(node);
                if (node.next != null) {
                    node = node.next.next;
                }
            } while (node != null && node.next != null);
            return head.next;
        }

        public void main(String... args) {
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            Node n4 = new Node(4);
            Node n5 = new Node(5);
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            Node s = n1;
            System.out.print("Before::");
            while (n1 != null) {
                System.out.print(n1.val + "->");
                n1 = n1.next;
            }
            jumble(s);
            System.out.println();
            System.out.print("After:: ");
            while (s != null) {
                System.out.print(s.val + "->");
                s = s.next;
            }
        }

    }

    public static int findStartingPosition(int[] arr) {
        int[] change = new int[arr.length];
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] < len) {
                int start = (i + 1) % len;
                int end = (len + i - arr[i]) % len;
                change[start]++;
                if (end + 1 < len) {
                    change[end + 1]--;
                }
            }
        }
        int bestPosition = 0;
        int currentTotal = 0;
        int max = 0;
        for (int j = 0; j < len; j++) {
            currentTotal += change[j];
            if (currentTotal > max) {
                max = currentTotal;
                bestPosition = j;
            }
        }

        return bestPosition;
    }

    public static void findBest() {
        int[] nums = {1, 4, 5, 2, 6, 3, 6, 3, 2};
        findStartingPosition(nums);
    }

    public static void run() {
        new Jumble().main();
//        TNode base = new TNode(1);
//        TNode head = base;
//        base.next = new TNode(2);
//        base = base.next;
//        base.next = new TNode(3);
//        base = base.next;
//        base.next = new TNode(4);
//        base = base.next;
//        base.next = new TNode(5);
//        jumble(head);
    }

    public static int findLongestWatchingPeriod(List<Pair<Integer, Integer>> intervals) {
        int[] counter = new int[24];
        for (Pair<Integer, Integer> interval : intervals) {
            counter[interval.fst]++;
            counter[interval.snd]--;
        }
        int totalTime = 0;
        int watchers = 0;
        for (int aCounter : counter) {
            watchers += aCounter;
            if (watchers > 0) {
                totalTime++;
            }
        }

        return totalTime;
    }

    public static void prepareIntervals() {
        int total = findLongestWatchingPeriod(
            Arrays.asList(
                new Pair<Integer, Integer>(1, 4),
                new Pair<Integer, Integer>(6, 8),
                new Pair<Integer, Integer>(2, 4),
                new Pair<Integer, Integer>(7, 9),
                new Pair<Integer, Integer>(10, 15)
            )
        );
        System.out.println("Total hours " + total);
        int total2 = findLongestWatchingPeriod(
            Arrays.asList(new Pair<Integer, Integer>(4, 6), new Pair<Integer, Integer>(1, 2))
        );
        System.out.println("Total hours " + total2);
        int total3 = findLongestWatchingPeriod(
            Arrays.asList(new Pair<Integer, Integer>(1, 4), new Pair<Integer, Integer>(2, 3))
        );
        System.out.println("Total hours " + total3);
    }

    public static void sortSquareArray() {
        int[] arr = {-9, -6, -4, -3, -1, 2, 4, 5, 7, 8, 10};
        int[] squared = sortedSquare(arr);
        System.out.println("FROM: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("TO: ");
        for (int i = 0; i < squared.length; i++) {
            System.out.print(squared[i] + " ");
        }
    }

    public static int[] sortedSquare(int[] sorted) {
        int[] squared = new int[sorted.length];
        int front = 0;
        int end = sorted.length - 1;
        int pos = end;
        while (front < end) {
            int sqrFront = sorted[front] * sorted[front];
            int sqrEnd = sorted[end] * sorted[end];

            if (sqrFront <= sqrEnd) {
                squared[pos] = sqrEnd;
                end--;
            } else {
                squared[pos] = sqrFront;
                front++;
            }
            pos--;
        }
        return squared;
    }

    public static int[] sortedSquare2(int[] sortedArray) {
        int[] sortedSquare = new int[sortedArray.length];
        int front = 0;
        int back = sortedArray.length - 1;
        int currentPos = sortedArray.length - 1;
        while (front <= back) {
            int frontSq = sortedArray[front] * sortedArray[front];
            int backSq = sortedArray[back] * sortedArray[back];
            if (frontSq <= backSq) {
                sortedSquare[currentPos] = backSq;
                back--;
            } else {
                sortedSquare[currentPos] = frontSq;
                front++;
            }
            currentPos--;
        }

        return sortedSquare;
    }

    public static void subArrayWithSum() {
        reverseWords();
        return;
//        int[] arr = {1, 9, 2, 5, 3, 4, 8, 14, 20, 40, 22, 6};
//        System.out.println("Has sub with sum "+ 18 + " ? " + (hasSubArrayWithSum(arr, 18) ? "Yes" : "No"));
//        System.out.println("Has sub with sum "+ 25 + " ? " + (hasSubArrayWithSum(arr, 25) ? "Yes" : "No"));
//        System.out.println("Has sub with sum "+ 74 + " ? " + (hasSubArrayWithSum(arr, 74) ? "Yes" : "No"));
//        System.out.println("Has sub with sum "+ 78 + " ? " + (hasSubArrayWithSum(arr, 78) ? "Yes" : "No"));
//        System.out.println("Has sub with sum "+ 7 + " ? " + (hasSubArrayWithSum(arr, 7) ? "Yes" : "No"));
    }

    public static boolean hasSubArrayWithSum(int[] arr, int sum) {
//        Arrays.sort(arr);

        int start = 0;
        int end = 0;
        int currentSum = arr[start];
        while (start <= end && end < arr.length) {
            if (currentSum == sum) {
                return true;
            } else if (currentSum > sum) {
                currentSum -= arr[start++];
            } else {
                currentSum += arr[end++];
            }
        }

        return false;
    }
//
//    public static boolean hasSubArrayWithSum(int[] arr, int sum) {
//        int start = 0;
//        int end = 0;
//        int currentSum = arr[start];
//        while (start <= end && end < arr.length) {
//            if (currentSum == sum) {
//                return true;
//            } else if (currentSum > sum) {
//                currentSum -= arr[start++];
//            } else {
//                currentSum += arr[end++];
//            }
//        }
//
//        return false;
//    }

    public static void reverseWords() {
        String reversed = "yes every man eats food";
        StringBuilder sentence = new StringBuilder();
        StringBuilder chunk = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) != ' ') {
                chunk.append(reversed.charAt(i));
            } else {
                sentence.append(chunk.reverse().toString());
                sentence.append(' ');
                chunk = new StringBuilder();
            }
        }
        sentence.append(chunk.reverse().toString());
        sentence.append(' ');
        System.out.println(sentence.reverse().toString().trim());
    }

    public static void testAddingToArray() {
        int[] arr = new int[]{1, 1, 0};
        int[] res = addNumber(arr, 9998999);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] addNumber(int[] arr, int num) {
        int resultArraySize = arr.length + 1;
        int nDigits = (int) Math.ceil(Math.log10(num));
        resultArraySize = Math.max(nDigits + 1, resultArraySize);
        int[] result = new int[resultArraySize];
        int i = arr.length - 1;
        int resultIndex = resultArraySize - 1;
        int carry = 0;
        while (num > 0 || i >= 0 || carry > 0) {
            int digitToAdd = num % 10;
            int digitFromArray = (i >= 0) ? arr[i] : 0;
            int sum = digitToAdd + digitFromArray + carry;
            result[resultIndex] = sum % 10;
            carry = sum >= 10 ? 1 : 0;
            num /= 10;
            i--;
            resultIndex--;
        }

        return result;
    }

    public static void blabla() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.peek();
        s.pop();

        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int a = q.remove();
        System.out.println("Item = " + a);
    }

    public static void palindrome() {
        permutate();
        System.out.println(isPalindrome("A man, a plan, a canal, Panama! "));
        // abbacabba
        System.out.println(isPalindrome("#!@$% Ab !@%!@ B  !%@!%!@% a  1%!@% C  !@%!@% a  1%!@% B 1%!@% b @!#)(*) A "));

        System.out.println(isPalindrome("TEST"));
    }

    public static boolean isPalindrome(String s) {
        System.out.println(s);
        char a, b;
        int valA, valB;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            a = Character.toLowerCase(s.charAt(i));
            valA = a - 'a';
            b = Character.toLowerCase(s.charAt(j));
            valB = b - 'a';

            if (valA < 0 || valA >= 26) {
                i++;
                continue;
            }
            if (valB < 0 || valB >= 26) {
                j--;
                continue;
            }
            if (valA != valB) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    static void permutate(String[] words, int depth, String permutation) {
        if (depth == words.length) {
            System.out.println(permutation);
        } else {
            String w = words[depth];
            for (int i = 0; i < w.length(); i++) {
                permutate(words, depth + 1, permutation + w.charAt(i));
            }
        }
    }

    public static void permutate() {
        String[] words = {"red", "fox", "super"};
        permutate(words, 0, "");
    }

    private static boolean isValid(String s) {
        int num = Integer.valueOf(s);

        return num >= 1 && num <= 26;
    }

    public static int findNumEncodings(String s) {
        if (s.length() == 0) return 1;
        if (s.length() == 1) return 1;
        int num = 0;
        num += findNumEncodings(s.substring(1));
        if (isValid(s.substring(0, 2))) {
            num += findNumEncodings(s.substring(2));
        }
        return num;
    }

    public static class MergeSort {
        public static void mergeSort(int[] array) {

        }

        public static void partialSort(int[] arr, int low, int mid, int high) {

        }
    }

    private static class Interval {
        public int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private static class Point {
        public boolean isStart;
        public int location;

        public Point(boolean start, int loc) {
            location = loc;
            isStart = start;
        }
    }

    public static class findIntervals {

        public static void findIntervals() {
            findIntervals2(
                new Interval[]{
                    new Interval(1, 100),
                    new Interval(250, 550),
                    new Interval(1000, 1200),
                    new Interval(400, 600),
                    new Interval(800, 900),
                    new Interval(1100, 1150)
                }
            );
        }

        public static void findIntervals2(Interval[] intervals) {
            List<Point> points = new ArrayList<>();
            for (Interval i : intervals) {
                points.add(new Point(true, i.start));
                points.add(new Point(false, i.end));
            }
            Collections.sort(points, new Comparator<Point>() {
                @Override
                public int compare(Point p1, Point p2) {
                    return p1.location - p2.location;
                }
            });
            List<Interval> result = new ArrayList<>();
            int current = 0;
            int startLocation = -1;
            for (Point p : points) {
                if (p.isStart) {
                    if (current == 0) {
                        startLocation = p.location;
                    }
                    current++;
                } else {
                    current--;
                    if (current == 0) {
                        result.add(new Interval(startLocation, p.location));
                    }
                }
            }
            for (Interval in : result) {
                System.out.println(String.format("(%d,%d)", in.start, in.end));
            }
        }
    }

    public static class PermutateMultiWords {

        private static void permutate(String prefix, String str, List<String> results) {
            int n = str.length();
            if (n == 0) {
                results.add(prefix);
            } else {
                for (int i = 0; i < n; i++) {
                    permutate(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), results);
                }
            }
        }

        public static void permutate() {
            List<String> res = new ArrayList<>();
            permutate("", "foxy", res);
            for (String s : res) {
                System.out.println(s);
            }
        }
    }

    public static int kthLargest(int[] array, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k + 1);
        if (array.length < k + 1) {
            System.out.println("Array size is smaller than k.");
            return 0;
        }
        for (int i = 0; i < k + 1; i++) {
            queue.add(array[i]);
        }
        int result;
        for (int i = k; i < array.length; i++) {
            if (array[i] > queue.peek()) {
                result = queue.peek();
                System.out.println("Peak at " + queue.peek());
                queue.remove();
                queue.add(array[i]);
            }
        }

        System.out.println(k + "th Element is " + queue.peek());
        result = queue.peek();

        return result;
    }

    private final static String PARAM_URL = "url";

    private static void addUrl(HashMap<String, String> bundle, String url) {
        String urlParam = PARAM_URL;
        int part = 2;
        while (url.length() > 0) {
            bundle.put(urlParam, url.substring(0, Math.min(url.length(), 42)));
            if (url.length() > 42) {
                url = url.substring(42, url.length());
            } else {
                url = "";
            }
            urlParam = PARAM_URL + "_part_" + part;
            part++;
        }
    }

    public static void printSums(int c1, int c2, int c3) {
        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        for (int sum = 1; sum <= 1000; sum++) {
            if (sums.contains(sum - c1) || sums.contains(sum - c2) || sums.contains(sum - c3)) {
                System.out.println(sum);
                sums.add(sum);
            }
        }
    }


    public static class ReverseTree {
        private static class Node {
            public int data;
            public Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        public static void run() {
            Node head = new Node(1);
            Node curr = head;
            int[] items = new int[]{2, 3, 4, 5, 4, 3, 2, 1};
            for (int i : items) {
                curr.next = new Node(i);
                curr = curr.next;
            }
            isPalindrome(head);
        }

        private static boolean isPalindrome(Node head) {
            Node fast = head;
            Node slow = head;
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node tail = reverseNodes(slow);

            while (head != null && tail != null) {
                if (head.data != tail.data) {
                    return false;
                }
                head = head.next;
                tail = tail.next;
            }

            return true;
        }

        private static Node reverseNodes(Node slow) {
            Node current = slow;
            Node next = slow.next;
            Node after = next.next;
            current.next = null;
            while (next != null) {
                next.next = current;
                current = next;
                next = after;
                after = after != null ? after.next : null;
            }

            return current;
        }

    }
    // [1]-->[2]-->[3]-->[4]-->[5]-->[4]-->[3]-->[2]-->[1]
    //  .......................Curr---Next--After
    //

    public static void moveNonZeros() {
//        int[] arr = new int[]{0,3,4,5,0,5,-3,-4,-5,-6,-7,0,-2,-3,-4,1,3,100,102,0,12,23};
        int[] arr = new int[]{0, 0, 1, 0, 0};
        moveNonZerosToEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void moveNonZerosToEnd(int[] arr) {
        if (arr == null) {
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] != 0) {
                right--;
            } else {
                arr[right] = arr[left];
                arr[left] = 0;
                left++;
            }
        }
        return;
    }

    public static class Decoder {
        private static class SubPattern {
            int start, end, repeat, numDigits;
        }

        public static SubPattern findSubPattern(String str) {
            SubPattern sp = new SubPattern();
            int i = 0;
            while (i < str.length()) {
                if (str.charAt(i) == '[') {
                    sp.start = i;
                    setNumDigits(str, i, sp);
                }
                if (str.charAt(i) == ']') {
                    sp.end = i;
                    return sp;
                }
                i++;
            }
            return null;
        }

        public static void setNumDigits(String str, int before, SubPattern subPattern) {
            int i = before - 1, result = 0, digits = 0, digit = str.charAt(i) - '0';
            while (i >= 0 && digit >= 0 && digit <= 9) {
                result += (Math.pow(10, digits) * digit);
                digits++;
                i--;
                if (i >= 0) {
                    digit = str.charAt(i) - '0';
                }
            }
            subPattern.numDigits = digits;
            subPattern.repeat = Math.max(1, result);
        }

        public static String repeat(String fullStr, SubPattern subPattern) {
            String str = fullStr.substring(subPattern.start + 1, subPattern.end);
            int num = subPattern.repeat;
            String result = "";
            while (num > 0) {
                result += str;
                num--;
            }

            return result;
        }

        public static String decode(String src) {
            String str = src;
            SubPattern sp = findSubPattern(str);
            while (sp != null) {
                str = str.substring(0, sp.start - sp.numDigits) + repeat(str, sp)
                    + ((sp.end < str.length() - 1) ? str.substring(sp.end + 1) : "");
                sp = findSubPattern(str);
            }
            return str;
        }
    }

    public static class AmazingNumbersBestPosition {
        public static int findStartingPosition(int[] arr) {
            int[] change = new int[arr.length];
            int len = arr.length;

            for (int i = 0; i < len; i++) {
                if (arr[i] < len) {
                    int start = (i + 1) % len;
                    int end = (len + i - arr[i]) % len;
                    change[start]++;
                    if (end + 1 < len) {
                        change[end + 1]--;
                    }
                }
            }
            int bestPosition = 0;
            int currentTotal = 0;
            int max = 0;
            for (int j = 0; j < len; j++) {
                currentTotal += change[j];
                if (currentTotal > max) {
                    max = currentTotal;
                    bestPosition = j;
                }
            }

            return bestPosition;
        }
    }


}
