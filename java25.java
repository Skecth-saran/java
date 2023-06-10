class Employee {
    private String name;
    private String designation;
    private double salary;

    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class Employee_details {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Saran", "HR", 50000);
        Employee employee2 = new Employee("Poori", "Engineer", 30000);
        System.out.println("Employee Details");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
        employee1.raiseSalary(7);
        employee2.raiseSalary(6);
        System.out.println("After raising salary");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
    }
}
