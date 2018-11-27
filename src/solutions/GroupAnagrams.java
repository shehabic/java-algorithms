package solutions;

import java.util.*;

public class GroupAnagrams {
    public static void test() {
        String[] inputs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams sut = new GroupAnagrams();
        sut.groupAnagrams(inputs);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> collection = new HashMap<>();
        for (String str: strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            List<String> words = collection.getOrDefault(String.valueOf(s), new ArrayList<>());
            words.add(str);
            collection.put(String.valueOf(s), words);
        }

        List<List<String>> items = new ArrayList<>(collection.values());
        return items;
    }
}
