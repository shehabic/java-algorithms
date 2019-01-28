package solutions;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CDPath {
    public static String path(String currentPath, String newPath) {
            String path = newPath.startsWith("/") ? newPath : currentPath + "/" + newPath;
            Deque<String> stack = new LinkedList<>();
            String[] parts = path.split("/");
            List<String> result = new ArrayList<>();
            String output = "";
            for (String s: parts) {
                if (s.equals(".") || s.equals("")) continue;
                if (s.equals("..")) {
                    if (!stack.isEmpty()) stack.pop();
                } else {
                    stack.push(s);
                }
            }
            while (!stack.isEmpty()) {
                result.add(stack.pop());
            }
            for (int i = result.size() - 1; i >= 0; i--) {
                output += "/" + result.get(i);
            }
            return output.length() == 0 ? "/" : output;
    }

    public static void test() {
        System.out.println(path("/Users/shehabic", "development/flutter/tools"));
        System.out.println(path("/Users/shehabic", "../../Users/flutter/tools"));
        System.out.println(path("/Users/shehabic", "./development/flutter/tools"));
        System.out.println(path("/Users/shehabic", "./././../development/flutter/tools"));
        System.out.println(path("/Users/shehabic", "/flutter/tools"));
        System.out.println(path("/Users/shehabic", "../../../../../flutter/tools"));
        System.out.println(path("/Users/shehabic", "/development/flutter/tools"));
    }
}
