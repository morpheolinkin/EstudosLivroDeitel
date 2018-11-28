package com.jefferson.exemplo8_7;
public class Employer 
{
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // construtor para inicializar nome, data de nascimento e data de contratação
    public Employer(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return String.format("%s, %s Hired: %s  Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
    
    
    
}
