package inheritence;

// Abstract Class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate * hoursWorked); 
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Department Interface
interface Department {
    void assignDepartment(String deptName);
}

// Class implementing Department
class DepartmentEmployee extends FullTimeEmployee implements Department {
    private String department;

    public DepartmentEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary, bonus);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
        System.out.println(getName() + " is assigned to " + deptName + " department.");
    }
}

// Driver Class
public class EmployeeDemo {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(101, "Rahul", 30000, 5000);
        PartTimeEmployee pte = new PartTimeEmployee(102, "Aman", 500, 40);
        DepartmentEmployee de = new DepartmentEmployee(103, "Priya", 40000, 8000);

        fte.displayDetails();
        System.out.println("Full-Time Salary: " + fte.calculateSalary());

        pte.displayDetails();
        System.out.println("Part-Time Salary: " + pte.calculateSalary());

        de.displayDetails();
        System.out.println("Department Employee Salary: " + de.calculateSalary());
        de.assignDepartment("IT");
    }
}
