package mirea.lab9.task1;

public class Student {
    private int id;
    private String name;

    public Student (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public String toString() {
        return "Student{" +
                "iDNumber=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
