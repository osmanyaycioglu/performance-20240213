package training.performnace.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class StringTest {

    public static void main(String[] args) throws InterruptedException {
        // List<String> listLoc = new LinkedList<>();
        String str  = "deneme %s %d";
        for (int i = 0; i < 15_000; i++) {
            String.format(str,"osman",i);
        }
        Thread.sleep(1_000);
        System.gc();
        Thread.sleep(1_000);

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            String x = String.format(str,"osman",i);
        }
        System.out.println("Concat delta : " +(System.currentTimeMillis() -delta));
    }
}
