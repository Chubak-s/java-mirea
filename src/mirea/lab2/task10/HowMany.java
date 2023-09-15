package mirea.lab2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("Введите предложение: ");
        int countOfSpace = 1;

        Scanner source = new Scanner( System.in );
        String string = source.nextLine();

        for ( int i = 0; i < string.length()-1; i++ ){
            if ( (string.charAt(i) == ' ') && (string.charAt(i+1) != ' ') && (string.length() - 1 != i) ) {
                countOfSpace++;
            }
        }

        System.out.println( "Количество слов: " +  countOfSpace );
    }
}
