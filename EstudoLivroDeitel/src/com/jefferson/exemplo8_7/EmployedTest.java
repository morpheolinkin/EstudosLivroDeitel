package com.jefferson.exemplo8_7;
public class EmployedTest 
{
    public static void main (String[] args)
    {
        Date hire = new Date (3, 12, 1988); 
        Date birth = new Date(7, 11, 1949);
        
        Employer employee = new Employer("José", "Silva Gonçalves", birth, hire);
        
        System.out.println(employee);//Só tem um método na classe Employer
    }
    
}
