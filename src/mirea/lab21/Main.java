package mirea.lab21;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = {5, 1, 4, 10, 9};
        Array<Integer> a = new Array<>(new ArrayList<>(List.of(nums)));
        System.out.println(a.get(4).getClass());
        a.print5first();
    }
}
