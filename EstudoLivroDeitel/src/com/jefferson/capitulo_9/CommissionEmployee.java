package com.jefferson.capitulo_9;

public class CommissionEmployee extends Employee {

    private double grossSale;// vendas brutas semanais
    private double commissionRate;// porcentagem da comissão

    public CommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSale, 
            double commissionRate) 
    {
        super(firstName, lastName, socialSecurityNumber);
        if (grossSale < 0.0) {
            throw new IllegalArgumentException(
                    "Gross Sale must be >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        if (grossSale < 0.0) {
            throw new IllegalArgumentException("Gross Sale must be >= 0.0");
        }
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return getCommissionRate() * getGrossSale();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f%n",
                "Commissioned Employed", super.toString(),
                "gross sales", grossSale, "commission rate", commissionRate);
    }

}
