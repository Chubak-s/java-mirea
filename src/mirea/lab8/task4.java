package mirea.lab8;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите k (разраядность числа)");
        int k = scanner.nextInt();
        System.out.println("Введите s (сумма для сравнения)");
        int s = scanner.nextInt();
        int count;
        count = findNumbers(k, s, (int)Math.pow(10,k-1));
        System.out.println(count);
    }

    private static int findNumbers(int k, int s, int counter) {
        if(counter == (int)Math.pow(10,k)) return 0;
        if(sum(counter) == s) return 1 + findNumbers(k, s, ++counter);
        return findNumbers(k, s, ++counter);
    }

    private static int sum(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}