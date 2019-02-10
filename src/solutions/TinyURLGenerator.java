package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TinyURLGenerator {

    public static void test() {
        String[] urls = new String[] {
            "https://www.google.com",
            "https://www.facebook.com",
            "https://www.amazone.com",
            "https://www.microsoft.com",
            "https://www.booking.com",
        };
        for (String url: urls) {
            TinyURLGenerator sut = new TinyURLGenerator();
            System.out.println("Url: " + url);
            String tiny = sut.encode(url);
            System.out.println("TinyUrl: " + tiny);
            System.out.println("Full agin: " + sut.decode(tiny));
            System.out.println("-------------------------");
        }
    }


    private static final String BASE = "https://b.co/";
    private static final String CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_=";
    private static char[] b64;
    private static Map<Character, Integer> b64toIndex = new HashMap<>();

    private Map<Integer, String> db = new HashMap<>();
    private int id = 1000000;

    static {
        b64 = CHARS.toCharArray();
        int j = 0;
        for (char c : b64) b64toIndex.put(c, j++);
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int id = nextId();
        db.put(id, longUrl);
        String key = toB64(id);
        return BASE + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String key = shortUrl.replace(BASE, "");
        int id = toB10(key);
        return db.get(id);
    }

    private String toB64(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(b64[num % 64]);
        num /= 64;
        while (num > 0) {
            sb.append(b64[num % 64]);
            num /= 64;
        }
        return sb.reverse().toString();
    }

    private int toB10(String slug) {
        int res = 0;
        for (char c : slug.toCharArray()) {
            res = res * 64 + b64toIndex.get(c);
        }
        return res;
    }

    private synchronized int nextId() {
        id = id + 1 + new Random().nextInt(1000000);
        return id;
    }
}
