package mirea.lab7.task5;

public class StringManip implements StringUtils{


    public int countCharacters(String s) {
        return s.length();
    }



    public String getOddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }


    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}


