package solutions;

import Utils.Printing;

import java.util.*;

public class WordLadder {

    public static void test() {
        String[][] set = new String[][]{
            {"hot", "dot", "dog", "lot", "log", "cog"},
            {"hit"},
            {"cog"},

            {"hot", "dot", "dog", "lot", "log"},
            {"hit"},
            {"cog"},

            {"hot", "dot", "dog", "lot", "log", "not", "nan", "nut", "cut", "put", "are", "far", "pin"},
            {"hit"},
            {"put"},
        };
        for (int i = 0; i < set.length; i += 3) {
            System.out.println("Input: " + Printing.printArray(",", set[i]));
            System.out.println("Begin: " + set[i + 1][0]);
            System.out.println("End: " + set[i + 2][0]);
            System.out.println("Result: " + ladderLength(set[i + 1][0], set[i + 2][0], Arrays.asList(set[i])));
        }
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> unvisited = new HashSet<>(wordList);
        if (!unvisited.contains(endWord)) return 0;
        unvisited.remove(beginWord);
        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distances = new HashMap<>();
        distances.put(beginWord, 1);
        queue.offer(beginWord);
        while (!queue.isEmpty()) {
            String word = queue.poll();
            if (word.equals(endWord)) {
                return distances.get(endWord);
            }
            for (String neighbor : neighbors(word.toCharArray(), unvisited)) {
                distances.put(neighbor, distances.get(word) + 1);
                queue.add(neighbor);
                unvisited.remove(neighbor);
            }
        }

        return 0;
    }

    public static List<String> neighbors(char[] word, Set<String> unvisited) {
        List<String> results = new ArrayList<>();
        String temp = new String(word);
        for (int i = 0; i < word.length; i++) {
            for (int c = 0; c < 26; c++) {
                word[i] = (char) (c + 'a');
                String tempWord = new String(word);
                if (unvisited.contains(tempWord)) {
                    results.add(tempWord);
                }
            }
            word = temp.toCharArray();
        }
        return results;
    }
}
