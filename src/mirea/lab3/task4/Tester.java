package mirea.lab3.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner source = new Scanner(System.in);

        int size;

        do {
            System.out.print( " Введите размер массива, больше нуля: " );
            size = source.nextInt();
        } while (size <= 0);

        int[] array = new int[size];

        Random rand = new Random();

        for ( int i = 0; i < size; i++ ){
            array[i] = rand.nextInt(size);
        }

        System.out.print( "Первоначальный массив: " );
        for ( int i = 0; i < size; i++ ) {
            System.out.print(array[i] + " ");
        }

        ArrayList<Integer> arrayOfEven = new ArrayList<>();

        for ( int i = 0; i < size; i++ ) {
            if ( array[i] % 2 == 0 ) {
                arrayOfEven.add ( array[i] );
            }
        }

        System.out.println();

        System.out.print( "Массив из четных чисел: " );
        for (int i = 0; i < arrayOfEven.size(); i++) {
            System.out.print(arrayOfEven.get(i) + " ");
        }
    }
}
