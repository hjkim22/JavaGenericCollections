package collection.map.test;

import java.util.*;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 100);
        map.put("망고", 100);
        map.put("바나나", 1000);
        map.put("딸기", 1000);

        List<String> list = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1000) {
                list.add(key);
            }
        }
        System.out.println(list);
    }
}
