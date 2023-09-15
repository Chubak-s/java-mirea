package mirea.lab2.task5;

import mirea.lab2.task4.Computer;

import java.util.ArrayList;
import java.util.List;

public class DogNursery{
    private List<Dog> listOfDogs;

    public DogNursery(){ listOfDogs = new ArrayList<>(); }

    public void add( Dog dog ) {
        listOfDogs.add( dog );
    }
    public static class Dog {

        private String name;
        private int age;

        public Dog() {};

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int convertAgeIntoHuman(int age) {
            return (age * 8);
        }

        public void ToString() {
            System.out.println("кличка: " + name +
                    ", возраст: " + age);
        }
    }
}


