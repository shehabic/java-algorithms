package solutions;

import java.util.ArrayList;
import java.util.List;

public class ReadNCharactersGivenRead4 {

    int read4(char[] output) {
        return 4;
    }

    public int read(char[] buf, int n) {
        if (n == 0) return 0;
        char[] output = new char[4];
        List<Character> chars = new ArrayList<>();
        boolean eof = false;
        while (chars.size() < n && !eof) {
            int count = read4(output);
            for (int j = 0; j < count && chars.size() < n; j++) chars.add(output[j]);
            eof = count < 4;
        }
        for (int i = 0; i < chars.size(); i++) buf[i] = chars.get(i);

        return chars.size();
    }

}
