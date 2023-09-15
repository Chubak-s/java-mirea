package mirea.lab3.formatString;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double rubToDoll = 0.0101;
        double rubToEuro = 0.00948;
        Currency curDollar = Currency.getInstance("USD");
        Currency curEuro = Currency.getInstance("EUR");

        Scanner source = new Scanner(System.in);

        System.out.print("Введите сумму (руб): ");
        int rub = source.nextInt();

        double dollar = rubToDoll * rub;
        double euro = rubToEuro * rub;

        DecimalFormat decimalFormat = new DecimalFormat("######.####");

        String formatted_dollar = decimalFormat.format(dollar);
        String formatted_euro = decimalFormat.format(euro);


        System.out.println("Сумма в долларах: " + formatted_dollar + " " + curDollar.getSymbol());

        System.out.println("Сумма в евро: " + formatted_euro + " " + curEuro.getSymbol());
    }
}
