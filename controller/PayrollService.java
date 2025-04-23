package controller;

import exceptions.InvalidSalaryRateException;
import models.Employee;

public class PayrollService {
    public double calculateNetSalary(Employee employee) throws InvalidSalaryRateException {
        if(employee.getTaxRate() > 1){
            throw new InvalidSalaryRateException("Tax rate should not be greater than 1");
        }else{
            double tax = employee.getTaxRate() * employee.getSalary();
            double netSalary = employee.getSalary() + employee.getBonus() - tax;
            return netSalary;
        }
    }
}
