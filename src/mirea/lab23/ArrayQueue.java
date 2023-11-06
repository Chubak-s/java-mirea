package mirea.lab23;

public class ArrayQueue {
    private static final int MAX_SIZE = 100;
    private Object[] queue = new Object[MAX_SIZE];
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    public void enqueue(Object element) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail] = element;
        tail = (tail + 1) % MAX_SIZE;
        size++;
    }
    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }
    public Object dequeue() {
        Object element = element();
        queue[head] = null;
        head = (head + 1) % MAX_SIZE;
        size--;
        return element;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            queue[(head + i) % MAX_SIZE] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }
}