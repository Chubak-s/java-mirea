package mirea.lab9.task2;

import java.util.ArrayList;

import java.util.List;

public class Main {
    private static int separation(Student[] students, int l, int r) {
        Student separator = students[r];
        int i = l - 1;
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        Student temp;

        for (int j = l; j < r; j++) {
            if (comp.compare(students[j], separator) < 1) {
                temp = students[++i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        temp = students[++i];
        students[i] = students[r];
        students[r] = temp;
        return i;
    }

    public static void quickSort(Student[] students, int l, int r) {
        if (l < r) {
            int separator = separation(students, l, r);

            quickSort(students, l, separator - 1);
            quickSort(students, separator + 1, r);
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0]=(new Student("Alice", 3.8));
        students[1]=(new Student("Bob", 3.5));
        students[2]=(new Student("Charlie", 4.0));
        students[3]=(new Student("David", 3.9));

        System.out.println("Before sorting:");
        printStudents(students);

        quickSort(students, 0, students.length - 1);

        System.out.println("\nAfter sorting by GPA (descending order):");
        printStudents(students);
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
