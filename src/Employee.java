import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private int department;
    private int employeeId;
    private static int counter = 0;


    public Employee(String name, int department, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.employeeId = counter;
        counter++;

    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public String toString() {
        return "Employee: " + name + ". Salary: " + salary + ". Department: " + department + ". EmployeeId: " + employeeId;
    }
}