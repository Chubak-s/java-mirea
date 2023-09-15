package mirea.lab2.task4;

import mirea.lab2.task4.Computer;
import mirea.lab2.task4.Shop;

import java.util.Scanner;

public class TesterShop {
    public static void main(String[] args) {
        int operation;
        int id;
        String model;
        Shop shop = new Shop();

        Scanner source = new Scanner( System.in );

        System.out.println( "Меню: \n " +
                "1) Добавить Компьютер в магазин; \n " +
                "2) Удалить компьютер из магазина; \n " +
                "3) Найти компьютер по id; \n ");


        while( true ){
            System.out.println("Введите номер операции: ");
            operation = source.nextInt();

            switch (operation){
                case (1):
                    System.out.println( "Введите id: " );
                    id = source.nextInt();
                    source.nextLine();

                    System.out.println( "Введите название модели: " );
                    model = source.nextLine();

                    Computer currentComputer = new Computer( id, model );

                    shop.add(currentComputer);

                    break;

                case (2):
                    System.out.println( "Введите id: " );
                    id = source.nextInt();

                    if ( shop.delete(id) == true){
                        System.out.println( "Удалено успешно" );
                    } else {
                        System.out.println( "Неизвестное id" );
                    }

                    break;

                case (3):
                    System.out.println( "Введите id: " );
                    id = source.nextInt();
                    Computer searchedComputer = shop.search(id);

                    if ( searchedComputer != null){
                        System.out.println( "Модель компьютера: " + searchedComputer.getModel());
                    } else {
                        System.out.println( "Неизвестное id" );
                    }

                    break;

                default:
                    System.out.println("Неизвестный номер операции");

                    break;
            }
        }
    }
}
