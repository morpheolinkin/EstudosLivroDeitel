package com.jefferson.capitulo_9;

public class PayRollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = 
                new SalariedEmployee("Jhon", "Smith", "111-111-111-111", 800.00);
        
        HourlyEmployee hourlyEmployee = 
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        
        CommissionEmployee commissionEmployee = 
                new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        
        System.out.println("Employees processed indicidually:");
        
        System.out.printf("%n%s%n%s: $%,.2f%n%n", 
                salariedEmployee, "Earned", salariedEmployee.getPaymentAmount());
        
        System.out.printf("%s%n%s: $%,.2f%n%n", 
                hourlyEmployee, "Earned", hourlyEmployee.getPaymentAmount());
        
        System.out.printf("%s%n%s: $%,.2f%n%n", 
                commissionEmployee, "Earned", commissionEmployee.getPaymentAmount());
        
        System.out.printf("%s%n%s: $%,.2f%n%n", 
                basePlusCommissionEmployee, "Earned", basePlusCommissionEmployee.getPaymentAmount());
        
        // cria um array Employee de quatro elementos
        Employee[] employees = new Employee[4];
        
        // inicializa o array com Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        System.out.printf("Employees processed polymorphically:%n%n");
        
        // processa genericamente cada elemento no employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);// invoca toString
            
            // determina se elemento é um BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee)
            {
                // downcast da referência de Employee para
                // referência a BasePlusCommissionEmployee
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                
                System.out.printf("New base salary with 10%% increase is: $%,.2f%n", 
                        employee.getBaseSalary());
            }//Fim do if
                System.out.printf("Earned $%,.2f%n", currentEmployee.getPaymentAmount());
        }//Final do for
        for (int empregados = 0; empregados < employees.length; empregados++) {
            System.out.printf("Employees %d is %s%n",empregados, 
                    employees[empregados].getClass().getName());
        }
    }// fim de main
}// fim da classe PayRollSystemTest
