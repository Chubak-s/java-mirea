package mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("Введите год, месяц, день: ");
        int year = source.nextInt();
        int month = source.nextInt();
        int day = source.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        Date now = new Date();
        if (now.before(cal.getTime())==true){
            System.out.println("это в будущее");
        } else {
            System.out.println("это прошлое");
        }
    }
}
