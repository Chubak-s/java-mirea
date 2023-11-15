package mirea.lab8;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чсило");
        int x = scanner.nextInt();
        int sumX;
        sumX = sumOfX(x);
        System.out.println(sumX);
    }

    public static int sumOfX(int num) {
        if(num == 0) return 0;
        return num % 10 + sumOfX(num / 10);
    }
}
