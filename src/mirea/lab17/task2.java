package mirea.lab17;

public class task2 {
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new
                EmployeeController(model, view);
        controller.updateView();
        controller.setSalary(320000);
        System.out.println("\nAfter updating, Employee Details are as follows");
                controller.updateView();
    }
    private static Employee
    retriveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setId("01");
        employee.setName("Alexander Volkanovsky");
        employee.setProfession("Programmer");
        employee.setSalary(225000);
        return employee;
    }
}
