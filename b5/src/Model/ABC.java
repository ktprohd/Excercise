package Model;

import java.util.HashMap;

public class ABC {
    HashMap< String, Integer> hashMap = new HashMap<>();
    public ABC() {

        // them cac phan tu vao hashMap
        hashMap.put("A", 500);
        hashMap.put("B", 300);
        hashMap.put("C", 100);
    }
    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public int getValueForKey(String key) {
        return hashMap.getOrDefault(key, 0);
    }
}
