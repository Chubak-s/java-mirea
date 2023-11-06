package mirea.lab14.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text1 = "(1 + 8) - 9 / 4";
        String text2 = "6 / 5 - 2 * 9";

        String regex = "[0-9]+\\s+\\+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(text1);
        Matcher matcher2 = pattern.matcher(text2);

        boolean found1 = matcher1.find();
        boolean found2 = matcher2.find();

        System.out.println("В тексте 1 найдены цифры, за которыми стоит знак +: " + found1);
        System.out.println("В тексте 2 найдены цифры, за которыми стоит знак +: " + found2);
    }
}
