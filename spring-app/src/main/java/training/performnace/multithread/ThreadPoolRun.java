package training.performnace.multithread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolRun {
    public static void main(String[] args) {
        Executor executorLoc = Executors.newFixedThreadPool(10);

        executorLoc.execute(() -> System.out.println("Hello Thread : " + Thread.currentThread()
                                                                                  .getName()));
    }
}
