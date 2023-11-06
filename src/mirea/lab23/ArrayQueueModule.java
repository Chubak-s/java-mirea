package mirea.lab23;

public class ArrayQueueModule {
    private static final int MAX_SIZE = 100;
    private static Object[] queue = new Object[MAX_SIZE];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;
    public static void enqueue(Object element) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail] = element;
        tail++;
        size++;
    }
    public static Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }
    public static Object dequeue() {
        Object element = element();
        queue[head] = null;
        head++;
        size--;
        return element;
    }
    public static int size() {
        return size;
    }
    public static boolean isEmpty() {
        return size == 0;
    }
    public static void clear() {
        for (int i = 0; i < size; i++) {
            queue[head + i] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }
}
