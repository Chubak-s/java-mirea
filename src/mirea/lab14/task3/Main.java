package mirea.lab14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "At the moment I have 34 EUR, 55 USD, 13000 RUB.";
        Pattern pattern = Pattern. compile ("\\d+\\s*(USD|EUR|RUB)");
        Matcher m = pattern.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
