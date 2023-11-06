package mirea.lab20.task2_3;
import java.io.Serializable;
public class GenericClass<T extends Comparable<String>, V extends Animal & Serializable, K> {
    private T parameter1;
    private V parameter2;
    private K parameter3;

    public GenericClass(T parameter1, V parameter2, K parameter3) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.parameter3 = parameter3;
    }

    public T getParameter1() {
        return parameter1;
    }

    public V getParameter2() {
        return parameter2;
    }

    public K getParameter3() {
        return parameter3;
    }

    public void setParameter1(T parameter1) {
        this.parameter1 = parameter1;
    }

    public void setParameter2(V parameter2) {
        this.parameter2 = parameter2;
    }

    public void setParameter3(K parameter3) {
        this.parameter3 = parameter3;
    }

    public void printClassNames() {
        System.out.println("Class name of parameter 1: " + parameter1.getClass().getName());
        System.out.println("Class name of parameter 2: " + parameter2.getClass().getName());
        System.out.println("Class name of parameter 3: " + parameter3.getClass().getName());
    }

    public static void main(String[] args) {
        GenericClass<String, Animal, Double> a = new GenericClass<>("Hello", new Animal("Fish"), 3.14);
        a.printClassNames();
    }
}
