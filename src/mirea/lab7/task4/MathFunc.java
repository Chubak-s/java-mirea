package mirea.lab7.task4;

public class MathFunc implements MathCalculable {


    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }


    public double complexModulus(double realPart, double imaginaryPart) {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    public double calculateCircleLength(double radius) {
        return 2 * PI * radius;
    }
}
