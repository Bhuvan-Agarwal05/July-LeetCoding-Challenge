public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<String,String> map = new HashMap<>();
    String sp = "http://tinyurl.com/";
    
    public String encode(String longUrl) {
        String s = sp+longUrl.length()+"eK1";
        map.put(s,longUrl);
        return s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));