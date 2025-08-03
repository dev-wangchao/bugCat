package list;

import java.util.HashMap;
import java.util.Map;

public class Main {



    public static void main(String[] args) throws InterruptedException {
        Map<String, Object> hashMap = new HashMap<>(3);
        hashMap.put("1", 100);
        hashMap.put("2", 200);
        hashMap.put("2", 200);
        hashMap.put("3", 300);
        hashMap.put("4", 400);
        hashMap.put("5", 500);
        System.out.println(hashMap);
    }

}
