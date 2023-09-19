package mirea.lab7.task3;

public class MovablePoint implements Movable{

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }




    public void moveUp() {
        y+=ySpeed;
    }


    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }


    public void moveRight() {
        x += xSpeed;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }


    public boolean SpeedTest(MovablePoint point) {
        return xSpeed == point.getXSpeed() && ySpeed == point.getYSpeed();
    }
}
