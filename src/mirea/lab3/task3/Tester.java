package mirea.lab3.task3;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        int[] arr = new int[4];

        Random rand = new Random();

        for ( int i = 0; i < 4; i++ ) {
            arr[i] = rand.nextInt((99 - 10) + 1 ) + 10;
        }

        for ( int i = 0; i < 4; i++ ) {
            System.out.print( arr[i] + " " );
        }

        int flag = 1;

        for ( int i = 1; i < arr.length; i++ ) {
            if ( arr[i - 1] >= arr[i] ) {
                flag = 0;
                break;
            }
        }

        switch ( flag ) {
            case (0):
                System.out.println( "Не возрастающий массив" );
                break;
            case (1):
                System.out.println( "Возрастающий массив" );
                break;
        }
    }
}
