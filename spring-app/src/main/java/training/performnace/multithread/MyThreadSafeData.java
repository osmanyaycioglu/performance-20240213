package training.performnace.multithread;

import java.util.ArrayList;
import java.util.List;

public class MyThreadSafeData {
    private List<String> list = new ArrayList<>();

    public void add(String stringParam) {
        synchronized (this) {
            list.add(stringParam);
        }
    }

    public String get(int index) {
        synchronized (this) {
            return list.get(index);
        }
    }

}
