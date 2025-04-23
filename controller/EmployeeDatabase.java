package controller;

import java.util.HashMap;
import java.util.Map;

import exceptions.EmployeeNotFoundException;
import models.Employee;

public class EmployeeDatabase {
    Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {
        employees.put(employee.getEmployeeId(), employee);
    }

    public Employee getEmployee(Integer employeeId) throws EmployeeNotFoundException {
        Employee employee = employees.get(employeeId);
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee with id " + employeeId + " not found.");
        }
        return employee;
    }

    public void updateSalary(double salary, Employee employee){
        if(salary <= 0){
            throw new IllegalArgumentException("Salary must be greater than 0.");
        }else{
            employee.setSalary(salary);
        }
    }

}
