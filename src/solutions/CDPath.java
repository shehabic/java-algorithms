package solutions;

public class CDPath {
    public static String path(String currentPath, String newPath) {
        String[] part1 = currentPath.split("/");
        int end1 = part1.length - 1;

        if (newPath.startsWith("/")) {
            end1 = -1;
            newPath = newPath.substring(1);
        }
        String[] part2 = newPath.split("/");
        int start2 = 0;
        for(String dir: part2) {
            if (dir.equals(".")) {
                start2++;
            } else if (dir.equals("..")) {
                end1--;
                start2++;
            }
        }
        StringBuilder builder = new StringBuilder();
        if (end1 >= 0) {
            for (int i = 0; i <= end1; i++) {
                if (i > 0) {
                    builder.append("/");
                }
                builder.append(part1[i]);
            }
        }
        if (start2 <= part2.length - 1) {
            for (int i = start2; i < part2.length; i++) {
                builder.append("/");
                builder.append(part2[i]);
            }
        }


        return builder.toString();
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
