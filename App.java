import java.util.logging.Logger;

import controller.EmployeeDatabase;
import controller.PayrollService;
import exceptions.EmployeeNotFoundException;
import exceptions.InvalidSalaryRateException;
import models.Employee;

public class App{
    private static final Logger logger = Logger.getLogger(App.class.getName());
    
    public static void main(String[] args) {
        PayrollService payrollService = new PayrollService();
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        Employee firstOne = new Employee("John", 1000, 1, 1.2, 19.9);
        Employee secondOne = new Employee("Ben", 300.42, 2, 10, 1000);

        try{
            System.out.println("Net salary for (John): " + payrollService.calculateNetSalary(firstOne));
        }catch(InvalidSalaryRateException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}