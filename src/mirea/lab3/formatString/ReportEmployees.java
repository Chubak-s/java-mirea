package mirea.lab3.formatString;

import java.util.Formatter;


public class ReportEmployees {
    public static class Employee {
        private String fullname;
        private double salary;

        public Employee( String fullname, double salary ) {
            this.fullname = fullname;
            this.salary = salary;
        }

        public String getFullname( Employee employee ) {
            return employee.fullname;
        }

        public double getSalary( Employee employee ) {
            return employee.salary;
        }

    }

    public class Report {
        public static String generateReport( Employee[] employees ) {
            Formatter fmt = new Formatter();

            for (Employee employee:employees){
                fmt.format( "Имя: %10s\t\t Зарплата: %10.2f\n", employee.getFullname(employee), employee.getSalary(employee));
            }

            return fmt.out().toString();
        }
    }
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        Employee employee1 = new Employee("Василий", 38293.345);
        Employee employee2 = new Employee("Ярослав", 34997.344);
        Employee employee3 = new Employee("Иван", 132333.343);
        Employee employee4 = new Employee("Петр", 200343.2);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;

        System.out.println( Report.generateReport( employees ) );
    }


}
