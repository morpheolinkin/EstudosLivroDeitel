package com.jefferson.capitulo_9;

/**
 *
 * @author Tijuaçu
 */
public class HourlyEmployee extends Employee {

    private double wage;
    private int hours;

    public HourlyEmployee(String firstName, String lastName,
            String socialSecurityNumber, double wage, int hours) {
        super(firstName, lastName, socialSecurityNumber);
        if (wage < 0.0) {
            throw new IllegalArgumentException(
                    "Wage must be >= 0.0");
        }
        if (hours < 0) {
            throw new IllegalArgumentException(
                    "Hours must be > = 0");
        }

        this.hours = hours;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException(
                    "Wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException(
                    "Hours must be > = 0");
        }
        this.hours = hours;
    }
    
    // calcula os rendimentos; sobrescreve o método getPaymentAmount em Employee
    @Override
    public double getPaymentAmount() {
        if (getHours() <= 40) {// nenhuma hora extra
            return getWage() * getHours();

        } else{
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %,d",
                "Hourly Employee", super.toString(), 
                "hourly wage", getWage(), "hours worked", getHours());
    }
}
