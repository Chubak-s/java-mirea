package mirea.lab4_1.task4;

public class Tester {
    public static void main(String[] args) {
        double[][] data1 = {{15, 10}, {1.13, 5}};
        double[][] data2 = {{5.55, 4}, {7, 13}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Matrix1:");
        matrix1.print();
        System.out.println();

        System.out.println("Matrix2:");
        matrix2.print();
        System.out.println();

        Matrix sum = matrix1.sum(matrix2);
        System.out.println("Matrix1 + Matrix2:");
        sum.print();
        System.out.println();

        Matrix scaled = matrix1.multiplyByScalar(2);
        System.out.println("Matrix1 * 2:");
        scaled.print();
        System.out.println();

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Matrix1 * Matrix2:");
        product.print();
    }
}
