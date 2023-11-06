package mirea.lab23;


public class Main {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueADT();
        testArrayQueue();
    }

    private static void testArrayQueueModule() {
        ArrayQueueModule.enqueue("A");
        ArrayQueueModule.enqueue("B");
        ArrayQueueModule.enqueue("C");

        System.out.println("Size: " + ArrayQueueModule.size());
        System.out.println("Element: " + ArrayQueueModule.element());

        System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
        System.out.println("Size: " + ArrayQueueModule.size());

        ArrayQueueModule.clear();
        System.out.println("Size: " + ArrayQueueModule.size());
        System.out.println("Is Empty: " + ArrayQueueModule.isEmpty());
        System.out.println();
    }

    private static void testArrayQueueADT() {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queue, "X");
        ArrayQueueADT.enqueue(queue, "Y");

        System.out.println("Size: " + ArrayQueueADT.size(queue));
        System.out.println("Element: " + ArrayQueueADT.element(queue));

        System.out.println("Dequeue: " + ArrayQueueADT.dequeue(queue));
        System.out.println("Size: " + ArrayQueueADT.size(queue));

        ArrayQueueADT.clear(queue);
        System.out.println("Size: " + ArrayQueueADT.size(queue));
        System.out.println("Is Empty: " + ArrayQueueADT.isEmpty(queue));
        System.out.println();
    }

    private static void testArrayQueue() {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue("M");
        queue.enqueue("N");

        System.out.println("Size: " + queue.size());
        System.out.println("Element: " + queue.element());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());

        queue.clear();
        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
