package mirea.lab14.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuv18340";
        String s2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m1 = p1.matcher( s1 );
        Matcher m2 = p1.matcher( s2 );
        System.out.println(m1.matches());
        System.out.println(m2.matches());
    }
}
