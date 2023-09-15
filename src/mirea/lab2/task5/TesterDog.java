package mirea.lab2.task5;

import java.util.Scanner;

public class TesterDog {
    public static void main(String[] args) {
        String name;
        int age;
        DogNursery nursey = new DogNursery();
        Scanner source = new Scanner( System.in );

        for (int i=0; i<3; i++){

            DogNursery.Dog dog = new DogNursery.Dog();

            System.out.println("Введите кличку: ");
            name = source.nextLine();
            dog.setName( name );

            System.out.println("Введите возраст: ");
            age = source.nextInt();
            source.nextLine();
            dog.setAge( age );

            System.out.println("Человечксий возраст " + dog.getName() + ": " + dog.convertAgeIntoHuman(dog.getAge()));

            dog.ToString();

            nursey.add( dog );
        }
    }
}
