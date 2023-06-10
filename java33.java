import java.time.LocalDate;
import java.time.Period;

class Experice_of_employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Experice_of_employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void printEmployeeDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("HireDate: " + hireDate);
    }

}

public class Experience {
    public static void main(String[] args) {
        Experice_of_employee employee1 = new Experice_of_employee("Saran", 50000, LocalDate.parse("2021-04-01"));
        Experice_of_employee employee2 = new Experice_of_employee("Poori", 70000, LocalDate.parse("2015-04-01"));
        Experice_of_employee employee3 = new Experice_of_employee("Karan", 50000, LocalDate.parse("2011-01-15"));
        employee1.printEmployeeDetails();
        System.out.println("Years of Service: " + employee1.getYearsOfService());
        employee2.printEmployeeDetails();
        System.out.println("Years of Service: " + employee2.getYearsOfService());
        employee3.printEmployeeDetails();
        System.out.println("Years of Service: " + employee3.getYearsOfService());
    }
}
