package mirea.lab14.task1;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "I3love4Java 94!44!7 !";
        Pattern pattern = Pattern.compile("\\d+\\s?");
        String[] words = pattern.split(s);
        for (String word : words)
            System.out.println(word);
    }
}
