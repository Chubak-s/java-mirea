package mirea.lab2.task8;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String temp;
        Scanner source = new Scanner( System.in );

        System.out.println( "Введите размер массива: " );
        int size = source.nextInt();

        String[] arr = new String[size];

        for ( int i = 0; i < size; i++ ) {
            arr[i] = source.next();
        }

        for ( int i = 0; i < size/2; i++ ) {
            temp = arr[ size - i - 1 ] ;
            arr[ size - i - 1 ] = arr[i];
            arr[i] = temp;
        }

        for ( int i = 0; i < size; i++ ) {
            System.out.println( arr[i] );
        }
    }
}
