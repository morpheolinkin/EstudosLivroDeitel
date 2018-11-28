/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jefferson.capitulo_9;

/**
 *
 * @author Tijuaçu
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly Salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly Salary must be >= 0.0");
        
        this.weeklySalary = weeklySalary;
    }

    
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f","Salaried Employed:", super.toString(), 
                "weekly salary", weeklySalary);
    }
}
