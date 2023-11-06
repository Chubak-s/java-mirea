package mirea.lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        int numElements = 100000; // Количество элементов для операций

// Измерение времени выполнения операций на ArrayList
        List<Integer> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numElements; i++) {
            arrayList.add(i); // Вставка элемента в ArrayList
        }

        for (int i = 0; i < numElements; i++) {
            arrayList.remove(0); // Удаление элементов по индексу в ArrayList
        }

        for (int i = 0; i < numElements; i++) {
            arrayList.add(i, i); // Добавление элемента по индексу в ArrayList
        }

        for (int i = 0; i < numElements; i++) {
            arrayList.contains(i); // Поиск элемента в ArrayList
        }

        long arrayListTime = System.currentTimeMillis() - startTime;

// Измерение времени выполнения операций на LinkedList
        List<Integer> linkedList = new LinkedList<>();

        startTime = System.currentTimeMillis();

        for (int i = 0; i < numElements; i++) {
            linkedList.add(i); // Вставка элемента в LinkedList
        }

        for (int i = 0; i < numElements; i++) {
            linkedList.remove(0); // Удаление элементов по индексу в LinkedList
        }

        for (int i = 0; i < numElements; i++) {
            linkedList.add(i, i); // Добавление элемента по индексу в LinkedList
        }

        for (int i = 0; i < numElements; i++) {
            linkedList.contains(i); // Поиск элемента в LinkedList
        }

        long linkedListTime = System.currentTimeMillis() - startTime;

// Вывод результатов
        System.out.println("Время выполнения операций на ArrayList: " + arrayListTime + " мс");
        System.out.println("Время выполнения операций на LinkedList: " + linkedListTime + " мс");
    }
}