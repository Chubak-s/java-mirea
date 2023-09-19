package mirea.lab7.task5;

public class Main {
    public static void main(String[] args) {
        StringManip manipulator = new StringManip();

        String inputString = "Hello, World!";

        int characterCount = manipulator.countCharacters(inputString);
        System.out.println("Количество символов в строке: " + characterCount);

        String oddPositionChars = manipulator.getOddPositionCharacters(inputString);
        System.out.println("Символы на нечетных позициях: " + oddPositionChars);

        String reversedString = manipulator.reverseString(inputString);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}
