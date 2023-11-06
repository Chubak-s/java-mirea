package mirea.lab9.task1;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(23, "Samoilov"),
                new Student(17, "Makarov"),
                new Student(49, "Pavetkin"),
                new Student(3, "Boiko"),
                new Student(21, "Volkov")
        };

        System.out.println("Before sort");
        printStudents (students);

        insertionSort (students);

        System.out.println("After sort");
        printStudents (students);
    }

    public static void printStudents (Student[] students) {
        for (Student currentStudent : students) {
            System.out.println(currentStudent.toString());
        }
    }

    public static void insertionSort (Student[] students) {
        for (int i = 1; i < students.length; i++ ) {
            Student temp = students [i];
            int j = i-1;
            while (j>=0 && students[i].getId() < students[j].getId() ) {
                    students[i] = students[j];
                    students[j] = temp;
                    j--;
                    i--;
            }
        }
    }
}
