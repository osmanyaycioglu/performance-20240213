package training.performnace.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    private Map<String,String> map = new ConcurrentHashMap<>(10_000_000,0.9f,1_000);
    private Map<String,String> map2 = new Hashtable<>();

    public static void main(String[] args) throws InterruptedException {
        // List<String> listLoc = new LinkedList<>();
        Map<String,String> mapLoc = new HashMap<>();
        for (int i = 0; i < 15_000; i++) {
            mapLoc.put("osman","osman");
        }
        Thread.sleep(1_000);
        mapLoc.clear();
        System.gc();
        Thread.sleep(1_000);

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            String s = "osman" + i;
            mapLoc.put(s,s);
        }
        System.out.println("Put delta : " +(System.currentTimeMillis() -delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            mapLoc.containsKey("osman" + i);
        }
        System.out.println("Contains delta : " +(System.currentTimeMillis() -delta));

        delta = System.currentTimeMillis();
        for (String stringLoc : mapLoc.values()) {

        }
        System.out.println("Iterate delta : " +(System.currentTimeMillis() -delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            mapLoc.remove("osman" + i);
        }
        System.out.println("Remove delta : " +(System.currentTimeMillis() -delta));

//        listLoc.addAll(null);
//
//        listLoc.contains("osman1");
//        listLoc.containsAll(null);
//        listLoc.retainAll(null);
//        listLoc.removeAll(null);
    }

}
