package mirea.lab6.task6_9;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Printable> list = new ArrayList<>(Arrays.asList(
                new Book("Война и мир", 1000, "А.С. Пушкин"),
                new Book("Господин из Сан-Франциско", 2330, "И.А. Бунин")
        ));

        for(Printable value: list){
            value.print();
        }
    }
}
