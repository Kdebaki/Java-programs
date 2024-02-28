package week2;
import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    String gender;
    double salary;

    public Employee(String name, String gender, double salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    public void giveBonus() {
        if (gender.equalsIgnoreCase("female")) {
            double bonus = salary * 0.1;
            salary += bonus;
            System.out.println(name + "'s salary after bonus: " + salary);
        } else {
            System.out.println(name + " is not eligible for bonus.");
        }
    }
}

public class BonusForFemaleEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Female", 50000));
        employees.add(new Employee("Bob", "Male", 60000));
        employees.add(new Employee("Eve", "Female", 55000));

        System.out.println("Issuing 10% bonus for female employees:");
        for (Employee emp : employees) {
            emp.giveBonus();
        }
    }
}
