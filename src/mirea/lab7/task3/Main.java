package mirea.lab7.task3;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 2, 1, 1);

        System.out.println("Initial state:");
        System.out.println(rectangle);

        System.out.println("Moving up:");
        rectangle.moveUp();
        System.out.println(rectangle);

        System.out.println("Moving right:");
        rectangle.moveRight();
        System.out.println(rectangle);

        System.out.println("Moving down:");
        rectangle.moveDown();
        System.out.println(rectangle);

        System.out.println("Moving left:");
        rectangle.moveLeft();
        System.out.println(rectangle);

        if (rectangle.SpeedTest()) {
            System.out.println("Both points have the same speed.");
        } else {
            System.out.println("Points have different speeds.");
        }
    }
}
