package mirea.lab4;

import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Authorization auth = new Authorization();
        String name;
        int password;
        int op;
        boolean successLogin = false;
        Scanner source = new Scanner( System.in );

        System.out.println(" Авторизация ");

        System.out.println("Выберите способ входа: \n" +
                " 1) Создать аккаунт\n" +
                " 2) Войти в существующий");

        while (true) {

            op = source.nextInt();
            source.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Введите свое имя: ");
                    name = source.nextLine();
                    System.out.println("Придумайте пароль: ");
                    password = source.nextInt();
                    source.nextLine();
                    auth.createAccount(name, password);
                    System.out.println("Аккаунт успешно создан");
                    successLogin = true;
                    break;

                case 2:
                    System.out.println("Введите свое имя: ");
                    name = source.nextLine();
                    System.out.println("Введите пароль: ");
                    password = source.nextInt();
                    source.nextLine();
                    if (auth.login(name, password)) {
                        System.out.println("Вы успешно вошли в аккаунт");
                        successLogin = true;
                    } else {
                        System.out.println("Неправильно введен логин или пароль");
                    }
                    break;
            }
            if ( successLogin ){
                break;
            }
        }


        System.out.println("Каталог товаров: ");

        for ( Catalog catalog : Catalog.values()) {
            System.out.println(catalog);
        }

        System.out.println("Введите название выбранной категории: ");
        Catalog categories = Catalog.valueOf(source.nextLine());
        int shoppingCart = 0;

        switch (categories) {
            case smartphones:
                for (smartphones smartphone : smartphones.values()) {
                    System.out.println(smartphone);
                }
                System.out.println("Введите название выбранного товара: ");
                smartphones smartphone = smartphones.valueOf(source.nextLine());
                switch (smartphone) {
                    case Iphone_15:
                        shoppingCart = 200000;
                    case Samsung_Galaxy_s23:
                        shoppingCart = 90000;
                    case Google_Pixel_6:
                        shoppingCart = 800000;
                }
                break;
            case laptops:
                ;
                for (laptops laptop : laptops.values()) {
                    System.out.println(laptop);
                }
                System.out.println("Введите название выбранного товара: ");
                laptops laptop = laptops.valueOf(source.nextLine());
                switch (laptop) {
                    case Macbook_A1:
                        shoppingCart = 250000;
                    case Honor_Matebook_14:
                        shoppingCart = 90000;
                }
                break;
            case computers:
                for (computers computer : computers.values()) {
                    System.out.println(computer);
                }
                System.out.println("Введите название выбранного товара: ");
                computers computer = computers.valueOf(source.nextLine());
                switch (computer) {
                    case L1:
                        shoppingCart = 150000;
                    case N1:
                        shoppingCart = 120000;
                }
                break;
        }

        System.out.print("Сумма заказа составляет " + shoppingCart + "руб");
    }
}
