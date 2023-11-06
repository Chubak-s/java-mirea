package mirea.lab13.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String surname = src.nextLine();
        String name = src.nextLine();
        String patronymic = src.nextLine();
        Person person = new Person(surname, name, patronymic);
        System.out.println(person.getFullName());
    }
}
class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder(surname);

        if (name != "") {
            fullName.append(" ").append(name.charAt(0)).append(".");
        }

        if (patronymic != "") {
            fullName.append(" ").append(patronymic.charAt(0)).append(".");
        }

        return fullName.toString();
    }
}
