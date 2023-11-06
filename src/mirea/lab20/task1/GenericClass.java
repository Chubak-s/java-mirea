package mirea.lab20.task1;

public class GenericClass<T, V, K> {
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

    public static void main(String[] args) {
        GenericClass<Integer, String, Boolean> genericObject = new GenericClass<>(10, "Hello", true);

        System.out.println("Parameter 1: " + genericObject.getParameter1());
        System.out.println("Parameter 2: " + genericObject.getParameter2());
        System.out.println("Parameter 3: " + genericObject.getParameter3());

        genericObject.setParameter1(20);
        genericObject.setParameter2("World");
        genericObject.setParameter3(false);

        System.out.println("Updated Parameter 1: " + genericObject.getParameter1());
        System.out.println("Updated Parameter 2: " + genericObject.getParameter2());
        System.out.println("Updated Parameter 3: " + genericObject.getParameter3());
    }
}
