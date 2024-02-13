package training.performnace.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetTest {

    public static void main(String[] args) throws InterruptedException {
        // List<String> listLoc = new LinkedList<>();
        Set<String> listLoc = new HashSet<>();
        for (int i = 0; i < 15_000; i++) {
            listLoc.add("osman");
        }
        Thread.sleep(1_000);
        listLoc.clear();
        System.gc();
        Thread.sleep(1_000);

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            // UTF16
            listLoc.add("osman" + i);
        }
        System.out.println("Add delta : " +(System.currentTimeMillis() -delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLoc.contains("osman" + i);
        }
        System.out.println("Contains delta : " +(System.currentTimeMillis() -delta));

        delta = System.currentTimeMillis();
        for (String stringLoc : listLoc) {

        }
        System.out.println("Iterate delta : " +(System.currentTimeMillis() -delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listLoc.remove("osman" + i);
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
