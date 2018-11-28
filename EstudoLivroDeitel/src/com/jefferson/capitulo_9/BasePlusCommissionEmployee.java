package com.jefferson.capitulo_9;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary) 
    {
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
        if (baseSalary < 0.0) // valida baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) // valida baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f%n", 
                "Base Plus Commissioned Employee",super.toString(), 
                "Commission Rate:", getCommissionRate(), 
                "base salary", getGrossSale());
    }
    
    @Override
    public double getPaymentAmount() {
        return getBaseSalary() + super.getPaymentAmount();
    }
}// fim da classe BasePlusCommissionEmployee