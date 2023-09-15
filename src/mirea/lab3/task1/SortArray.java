package mirea.lab3.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner source = new Scanner( System.in );

        System.out.println( "Введите размер массива: " );
        int size = source.nextInt();
        double[] arr = new double[size];
        //random()math
        for ( int i = 0; i < size; i++ ) {
            arr[i] = Math.random();
        }
        for ( int i = 0; i < size; i++ ) {
            System.out.println( arr[i] );
        }

        Arrays.sort(arr);

        System.out.println( "Отсортированный массива:" );
        for (int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

        System.out.println();

        //Random
        Random rand = new Random();
        for ( int i = 0; i < size; i++ ) {
            arr[i] = rand.nextDouble();
        }
        for ( int i = 0; i < size; i++ ) {
            System.out.println( arr[i] );
        }

        System.out.println( "Отсортированный массива:" );
        for (int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }
    }
}
