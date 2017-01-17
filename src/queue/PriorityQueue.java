package queue;

/**
 * Created by xy on 2017/1/12.
 */
public interface PriorityQueue {
    public int size();
    public boolean isEmpty();
    Entry insert(Object key, Object value);
    Entry min();
    Entry removeMin();
}
class Entry{
    int key;
    int value;
}