package mirea.lab7.task4;

public class Main {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double result1 = mathFunc.power(2, 3);
        System.out.println("2^3 = " + result1);

        double result2 = mathFunc.complexModulus(3, 4);
        System.out.println("|3 + 4i| = " + result2);

        double circleLength = mathFunc.calculateCircleLength(5);
        System.out.println("Длина окружности с радиусом 5: " + circleLength);
    }
}
