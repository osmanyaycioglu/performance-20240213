package training.performnace.strings;

public class StringTest2 {

    public static void main(String[] args) throws InterruptedException {
        // List<String> listLoc = new LinkedList<>();
        String str  = "deneme %s %d";
        for (int i = 0; i < 15_000; i++) {
            String strx =  str + "osman" + i;
        }
        Thread.sleep(1_000);
        System.gc();
        Thread.sleep(1_000);

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            String strx =  str + "osman" + i;
        }
        System.out.println("Concat delta : " +(System.currentTimeMillis() -delta));
    }
}
