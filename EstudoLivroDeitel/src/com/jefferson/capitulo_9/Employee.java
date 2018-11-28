package com.jefferson.capitulo_9;

import com.jefferson.capitulo_9.*;
public abstract class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    public abstract double getPaymentAmount();
    
    // retorna a representação String do objeto CommissionEmployee
    @Override// indica que esse método substitui um método da superclasse
    public String toString() {
        return String.format("%s %s%n%s: %s%n",getFirstName(), getLastName(),
                "Social security number", getSocialSecurityNumber());
    }
}//Fim da classe
