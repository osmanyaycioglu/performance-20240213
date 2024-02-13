package training.performnace.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyThreadSafeData2 {
    private List<String> list = new ArrayList<>();
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void add(String stringParam) { // TH1
        try {
            readWriteLock.writeLock().lock();
            list.add(stringParam);
        } catch (Exception eParam) {
            throw new RuntimeException(eParam);
        } finally {
            readWriteLock.writeLock().unlock();
        }

    }

    public String get(int index) { //TH2
        try {
            readWriteLock.readLock().lock();
            return list.get(index);
        } catch (Exception eParam) {
            throw new RuntimeException(eParam);
        } finally {
            readWriteLock.readLock().unlock();
        }

    }

}
