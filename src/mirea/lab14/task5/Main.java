package mirea.lab14.task5;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String[] dates = {"29/02/2000", "30/04/2003", "01/01/2003", "30-04-2003", "1/1/1899"};
        String regex = "([0-2][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})";
        Pattern pattern = Pattern.compile(regex);

        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                System.out.println(date + " - правильная дата");
            } else {
                System.out.println(date + " - неправильная дата");
            }
        }
    }
}



