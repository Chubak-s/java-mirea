package mirea.lab11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        int year = source.nextInt();
        int month = source.nextInt()-1;
        int day = source.nextInt();
        int hour = source.nextInt();
        int min = source.nextInt();

        Date date = new Date(year-1900, month, day, hour, min);
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR, hour-12);
        cal.set(Calendar.MINUTE, min);

        System.out.println(date);
        System.out.println(cal.getTime());
    }
}
