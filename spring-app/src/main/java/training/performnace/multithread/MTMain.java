package training.performnace.multithread;

public class MTMain {
    public static void main(String[] args) {
        MyThreadSafeData myThreadSafeDataLoc = new MyThreadSafeData();
        myThreadSafeDataLoc.add("osman");
        myThreadSafeDataLoc.add("ali");
        myThreadSafeDataLoc.add("veli");

        myThreadSafeDataLoc.get(10);
    }
}
