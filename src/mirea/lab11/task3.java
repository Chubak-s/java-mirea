package mirea.lab11;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Student student = new Student(1, "Jack", "Daniels", 3);
        student.setBirth(2004, 2, 25);
        Scanner src = new Scanner(System.in);
        System.out.println("Выберите формат вывода даты рождения: 1 - краткий; 2 - полный");
        int operation = src.nextInt();
        switch (operation){
            case 1:
                System.out.println("год: " + student.getBirthDate().get(Calendar.YEAR) +
                        " месяц: " + student.getBirthDate().get(Calendar.MONTH) +
                        " день: " + student.getBirthDate().get(Calendar.DAY_OF_MONTH) );
                break;
            case 2:
                System.out.println(student.getBirthDate().getTime());
                break;
            default:
                System.out.println("некорректно выбран формат");
                break;
        }
    }
}

class Student{
    private int id;
    private String firstName;
    private String lastName;
    private int course;

    private Calendar birth = Calendar.getInstance();

    public Student(int id, String firstName, String lastName, int course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Calendar getBirthDate(){return birth;}

    public void setBirth(int y, int m, int d){
        birth.set(Calendar.YEAR, y);
        birth.set(Calendar.MONTH, m);
        birth.set(Calendar.DAY_OF_MONTH, d);
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course + '\'' +
                ", birthDate=" + birth.getTime() +
                '}';
    }
}
