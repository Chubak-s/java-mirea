package mirea.lab13.task1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String string = src.nextLine();
        //1
        strOut(string);
        //2
        System.out.println(string.charAt(string.length()-1));
        //3
        if (string.endsWith("!!!")){System.out.println("true");}
        //4
        if (string.startsWith("I like")){System.out.println("true");}
        //5
        if (string.contains("Java")){System.out.println("true");}
        //6
        search(string, "Java");
        //7
        String newString = change(string);
        System.out.println(newString);
        //8
        System.out.println(string.toUpperCase());
        //9
        System.out.println(string.toLowerCase());
        //10
        System.out.println(string.substring(7, 11));
    }
    static void strOut(String string){
        System.out.println(string);
    }
    static void search(String string, String searchString){
        for (int i=0; i<string.length(); i++){
            int flag=1;
            for (int j=0; j<searchString.length(); j++){
                if (string.charAt(i+j) != searchString.charAt(j) ) { flag=0; break;}
            }
            if (flag==1){
                System.out.println("Подстрока находится в позиции: "+(i+1)+"-"+(i+searchString.length()+1));
            };
        }
    }
    static String change(String string){
        String newString="";
        for (int i=0; i< string.length(); i++){
            if (string.charAt(i)=='a'){
                newString+="o";
            } else {
                newString+=string.charAt(i);
            }
        }
        return newString;
    }
}
