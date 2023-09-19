package mirea.lab6.task6_10;

import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

public class TesterShop implements Input {
    public static void main(String[] args) {

     Shop shop=new Shop();
     Scanner in =new Scanner(System.in);

     while(true){
         System.out.println("Выберите действие:");
         System.out.println("1. Добавить компьютер");
         System.out.println("2. Удалить компьютер");
         System.out.println("3. Найти компьютеры по марке");
         System.out.println("4. Выйти из программы");
         int choice = in.nextInt();

         switch (choice){
             case 1:
                Brand brand = chooseComputerBrand();
                Processor processor = new Processor(Input.getStringInput("Введите модель процессора: "));
                Memory memory = new Memory(Input.getIntInput("Введите объем оперативной памяти (в GB): "));
                Monitor monitor = new Monitor(Input.getDoubleInput("Введите размер монитора (в дюймах): "));
                Computer computer = new Computer(brand, processor, memory, monitor);
                shop.addComputer(computer);
                System.out.println("Компьютер добавлен в магазин.");
                break;


             case 2:
                 displayComputers(shop.computers);
                 int computerIndex = Input.getIntInput("Введите номер компьютера, который хотите удалить: ") - 1;
                 if (computerIndex >= 0 && computerIndex < shop.computers.size()) {
                     Computer removedComputer = shop.computers.remove(computerIndex);
                     System.out.println("Компьютер удален: " + removedComputer);
                 } else {
                     System.out.println("Недопустимый номер компьютера.");
                 }
                 break;


             case 3:
                 Brand searchBrand = chooseComputerBrand();
                 List<Computer> computersByBrand = shop.searchBrand(searchBrand);
                 if (computersByBrand.isEmpty()) {
                     System.out.println("Компьютеров данной марки нет в магазине.");
                 } else {
                     displayComputers(computersByBrand);
                 }
                 break;

             case 4:
                 System.out.println("Программа завершена.");
                 System.exit(0);
         }
     }
    }
    private static void displayComputers(List<Computer> computers) {
        if (computers.isEmpty()) {
            System.out.println("В магазине нет компьютеров.");
        } else {
            System.out.println("Список компьютеров:");
            for (int i = 0; i < computers.size(); i++) {
                System.out.println((i + 1) + ". " + computers.get(i));
            }
        }
    }

    private static Brand chooseComputerBrand() {
        System.out.println("Выберите марку компьютера:");
        int i = 1;
        for (Brand brand : EnumSet.allOf(Brand.class)) {
            System.out.println(i + ". " + brand);
            i++;
        }
        int choice = Input.getIntInput("Введите номер марки: ");
        if (choice >= 1 && choice <= Brand.values().length) {
            return Brand.values()[choice - 1];
        } else {
            System.out.println("Недопустимый номер марки.");
            return chooseComputerBrand();
        }
    }


}
