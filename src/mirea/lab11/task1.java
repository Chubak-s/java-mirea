package mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class task1 {
    public static void main(String[] args) {
        String surname = "Налбандян";
        System.out.println("Разработчик: " + surname);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 20);
        System.out.println("Дата получения задания: " + cal.getTime());
        Date now = new Date();
        System.out.println("Дата сдачи задания: " + now);
    }
}
