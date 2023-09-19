package mirea.lab6.task1;

public class Tester {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(10, 10, 2, 2, 1);
        circle.moveDown();
        circle.moveRight();
        circle.moveRight();
        System.out.println(circle.toString());
    }
}
