package training.performnace.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest {
    // List<String> list = new ArrayList<>(100); yanlış
    List<String> list = new Vector<>(100);
    // List<String> list = Collections.synchronizedList(new ArrayList<>(100));
    List<String> list2 = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        // List<String> listLoc = new LinkedList<>();
        List<String> listLoc = new ArrayList<>(1_200_000);
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
            String stringLoc = listLoc.get(i);
        }
        System.out.println("Get delta : " +(System.currentTimeMillis() -delta));

        delta = System.currentTimeMillis();
        for (String stringLoc : listLoc) {

        }
        System.out.println("Iterate delta : " +(System.currentTimeMillis() -delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            listLoc.remove(0);
        }
        System.out.println("Remove delta : " +(System.currentTimeMillis() -delta));

        // listLoc.addAll(null);

        // Kullanma
//        listLoc.contains("osman1");
//        listLoc.containsAll(null);
//        listLoc.retainAll(null);
//        listLoc.removeAll(null);
    }

    public void method1() {
        List<String> listLoc = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            listLoc.add("xyz");
        }
    }

    public void method2(String str){
        list.add(str);
    }
}
