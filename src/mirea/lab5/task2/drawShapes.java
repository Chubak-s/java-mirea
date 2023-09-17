package mirea.lab5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class drawShapes extends JFrame {
    public drawShapes(){

        setSize(800, 800);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){

        Random rand = new Random();

        int x, y;
        for (int i = 0; i < 20; i++ ) {
            x = rand.nextInt(600);
            y = rand.nextInt(600);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));

            int shapeType = rand.nextInt(3);

            Shape shape = switch (shapeType){
                case 1-> new Circle(x, y, 100);
                case 2-> new Triangle(x, y, 100);
                default-> new Rectangle(x, y, 100,100);
            };

            shape.draw(g, color);
        }
    }


    abstract class Shape {
        int xPos;
        int yPos;
        public Shape(int x, int y) {
            this.xPos = x;
            this.yPos = y;
        }

        abstract void draw(Graphics g, Color color);
    }

    class Rectangle extends Shape {
        int width;
        int height;

        public Rectangle(int x, int y, int width, int height) {
            super(x, y);
            this.width = width;
            this.height = height;
        }

        void draw(Graphics g, Color color) {
            g.setColor(color);
            g.fillRect(xPos, yPos, width, height);
        }
    }

    class Circle extends Shape {
        int radius;

        public Circle(int x, int y, int radius) {
            super(x, y);
            this.radius = radius;
        }

        // Метод для отрисовки круга
        void draw(Graphics g, Color color) {
            g.setColor(color);
            g.fillOval(xPos, yPos, radius, radius);
        }
    }
    class Triangle extends Shape {
        int side;
        public Triangle(int x, int y, int side) {
            super(x, y);
            this.side = side;
        }

        // Метод для отрисовки треугольника
        void draw(Graphics g, Color color) {
            g.setColor(color);

            int[] xPoints = {xPos, xPos + side, xPos + side / 2};
            int[] yPoints = {yPos + side, yPos + side, yPos};

            g.fillPolygon(xPoints, yPoints, 3);
        }
    }

    public static void main(String[] args) {

        drawShapes app = new drawShapes();
        app.setVisible(true);

    }

}

