package mirea.lab3.formatString;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        int price;
        double totalPrice;

        Scanner source = new Scanner(System.in);

        System.out.println( "Введите стоимость покупки товара (руб): " );
        price = source.nextInt();

        System.out.println( " Выберите валюту для оплаты: \n" +
                "1. RUB \n" +
                "2. USD \n"+
                "3. EUR \n");

        int currency = source.nextInt();
        Currency cur;

        switch (currency){
            case 1:
                totalPrice = price;
                cur = Currency.getInstance("RUB");
                break;
            case 2:
                totalPrice = price * 0.0101;
                cur = Currency.getInstance("USD");
                break;
            case 3:
                totalPrice = price * 0.00948;
                cur = Currency.getInstance("EUR");
                break;
            default:
                System.out.println( "Неизветстная валюта" );
                return;
        }

        String symbol = cur.getSymbol();

        DecimalFormat decimalFormat_ = new DecimalFormat("####.##");
        String formatted_total_price = decimalFormat_.format(totalPrice);

        System.out.println("Стоимость покупки товара составляет " + formatted_total_price + " " + symbol);
    }
}
