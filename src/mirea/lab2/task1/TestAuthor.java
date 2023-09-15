package mirea.lab2.task1;

import mirea.lab2.task1.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main( String[] args ) {
        String email;
        Author user = new Author("Chubak", "comp@mail.ru",'m' );

        Scanner source = new Scanner( System.in );

        System.out.println( "Почта пользователя: " + user.getEmail() );

        System.out.println( "Введите новый email" );
        email=source.nextLine();
        user.setEmail( email );

        System.out.println( "Данные пользователя: " + user.toString() );
    }
}
