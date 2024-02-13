package training.performnace.collections;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queueLoc = new ArrayBlockingQueue<>(1_000); // FIFO
        BlockingQueue<String> blockingQueueLoc;
        Deque<String> dequeLoc; // XIXO
        BlockingDeque<String> blockingDequeLoc;

        PriorityQueue<String> stringsLoc;
        // DelayQueue<String> delayQueueLoc;
    }
}
