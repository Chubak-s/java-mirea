package mirea.lab2.task9;

import java.util.Random;
import java.util.Scanner;

public class Pocker {
    public static void main(String[] args) {
        int players;

        Scanner source = new Scanner(System.in);

        String[] suits = {"Пики", "Червы", "Бубны", "Крести"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        while (true){
            System.out.println( "Введите количество игроков: " );

            players = source.nextInt();

            if (players * 5 <= 52){
                break;
            } else {
                if (players == 0) {
                    System.out.println( "Игроков нет" );
                    break;
                }
                else System.out.println( "Слишком много игроком" );
            }
        }

        String[] deck = new String[52];

        //формирование колоды
        for ( int i = 0; i < 13; i++ ) {
            for ( int j = 0; j < 4; j++ ) {
                deck[i * 4 + j] = rank[i] + " " + suits[j];
            }
        }

        //перетусовка колоды
        for (int i = 0; i < 52; i++){
            Random random = new Random();
            int randomIndex = random.nextInt(51);
            String temp = deck[randomIndex];
            deck[randomIndex] = deck[i];
            deck[i] = temp;
        }

        //раздача
        for ( int i = 0; i < players * 5; i++ ) {
            System.out.println( deck[i] );
            if ( i % 5 == 4 ) {
                System.out.println();
            }
        }
    }
}
