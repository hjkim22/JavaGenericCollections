package collection.map;

import java.util.HashMap;

public class MapMain2 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("A", 100);
        studentMap.put("A", 200); // 같은 키에 기존 값 교체
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("A");
        System.out.println(containsKey);

        boolean containsValue = studentMap.containsValue(200);
        System.out.println(containsValue);

        studentMap.remove("A");
        System.out.println(studentMap);
    }
}
