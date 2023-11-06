package mirea.lab8;

public class task6 {
    public static void main(String[] args) {
        int n = 16; // Проверяемое число

        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPrime(int n, int divisor) {
        // Базовый случай: если делитель равен числу, значит число простое
        if (divisor == n) {
            return true;
        }

        // Если число делится на divisor без остатка, значит оно составное
        if (n % divisor == 0) {
            return false;
        }

        // Проверяем следующий делитель
        return isPrime(n, divisor + 1);
    }
}
