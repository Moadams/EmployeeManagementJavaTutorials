package controller;

import models.Employee;

public class PayrollService {
    public double calculateNetSalary(Employee employee) {
        double tax = employee.getTaxRate() * employee.getSalary();
        double netSalary = employee.getSalary() + employee.getBonus() - tax;
        return netSalary;
    }
}
