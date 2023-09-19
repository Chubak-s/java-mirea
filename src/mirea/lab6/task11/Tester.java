package mirea.lab6.task11;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Введите температуру по Цельсию");

        Scanner src = new Scanner(System.in);
        double cel = src.nextDouble();

        Convertable kelvinConvert = new CelToK();
        double kelvin = kelvinConvert.convert(cel);
        System.out.println("Температура по Кельвину: " + kelvin);

        Convertable farConvert = new CelToF();
        double far = farConvert.convert(cel);
        System.out.println("Температура по Фаренгейту: " + far);

    }
}
