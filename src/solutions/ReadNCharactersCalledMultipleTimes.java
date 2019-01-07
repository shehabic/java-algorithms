package solutions;

public class ReadNCharactersCalledMultipleTimes {

    protected int read4(char[] output) {
        return 4;
    }

    private int buffPtr = 0;
    private int buffCount = 0;
    private char[] buff = new char[4];
    public int read(char[] buf, int n) {
        int ptr = 0;
        while (ptr < n) {
            if (buffPtr == 0) buffCount = read4(buff);
            if (buffCount == 0) break;
            while (ptr < n && buffPtr < buffCount) {
                buf[ptr] = buff[buffPtr];
                ptr++;
                buffPtr++;
            }
            if (buffPtr >= buffCount) buffPtr = 0;
        }
        return ptr;
    }
}
