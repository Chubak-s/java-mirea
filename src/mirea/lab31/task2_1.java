package mirea.lab31;
import mirea.lab8.task5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task2_1 {

    @Test
    public void testSumOfX() {
        // Тестирование функции sumOfX

        // Проверка, что для числа 12345 сумма будет равна 15
        int expectedResult = 15;
        int actualResult = task5.sumOfX(12345);
        assertEquals(expectedResult, actualResult);

        // Проверка, что для числа 0 сумма будет равна 0
        expectedResult = 0;
        actualResult = task5.sumOfX(0);
        assertEquals(expectedResult, actualResult);

        // Проверка, что для отрицательного числа -54321 сумма будет равна -15
        expectedResult = -15;
        actualResult = task5.sumOfX(-54321);
        assertEquals(expectedResult, actualResult);
    }
}
