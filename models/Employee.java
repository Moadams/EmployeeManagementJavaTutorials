package models;

public class Employee {
    private String name;
    private double baseSalary;
    private Integer employeeId;
    private double bonus;
    private double taxRate;

    public Employee(String name, double baseSalary, Integer employeeId, double taxRate, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeId = employeeId;
        this.taxRate = taxRate;
        this.bonus = bonus;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() { 
        return baseSalary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public double getBonus() {
        return bonus;
    }

    public double getTaxRate() {
        return taxRate;
    }


    // setters
    public void setSalary(double salary){
        this.baseSalary = salary;
    }
}
