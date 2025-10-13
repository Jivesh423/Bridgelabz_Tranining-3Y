package objectmodeling;

import java.util.ArrayList;
import java.util.List;

// Employee
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void showEmployee() {
        System.out.println("Employee: " + name);
    }
}

// Department (Composition inside Company)
class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.showEmployee();
        }
    }
}

// Company
class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showDepartment();
        }
    }
}

// Driver
public class CompanyDemo {
    public static void main(String[] args) {
        Company c1 = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Aman"));
        d1.addEmployee(new Employee("Riya"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Sita"));

        c1.addDepartment(d1);
        c1.addDepartment(d2);

        c1.showCompany();
    }
}
