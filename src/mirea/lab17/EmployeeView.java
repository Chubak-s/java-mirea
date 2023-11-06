package mirea.lab17;

public class EmployeeView {
    public void printEmployeeDetails(String name,
                                   String id, String profession, int salary) {
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Profession: " + profession);
        System.out.println("Salary: " + salary);
    }
}
