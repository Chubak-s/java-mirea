package mirea.lab6.task6_10;

import java.util.Scanner;

public interface Input {

    Scanner in=new Scanner(System.in);
    static String getStringInput(String prompt){
        System.out.println(prompt);
        return in.next();
    }

    static int getIntInput(String prompt){
        System.out.println(prompt);
        return in.nextInt();
    }


    static Double getDoubleInput(String prompt){
        System.out.println(prompt);
        return in.nextDouble();
    }

}
