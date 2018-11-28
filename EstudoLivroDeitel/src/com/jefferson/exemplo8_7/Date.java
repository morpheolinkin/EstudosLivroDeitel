package com.jefferson.exemplo8_7;
public class Date 
{
    private int day;
    private int month;
    private int year;
    
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 
        31, 30, 31, 30, 31};//Cada posição refere ao mês, então posso 
    //passar o mês como argumento no vetor
    //ai fica a quantidade de dias correto para o mês em questão
    

    //CONSTRUTOR: confirma o valor adequado para o mês e dia, dado o ano
    public Date(int day, int month, int year) 
    {
        // verifica se mês está no intervalo
        if(month <= 0 || month > 12)
            throw new IllegalArgumentException("Month (" + month + ") must be 1-12");
        
        //Verifica se day está no intervalo para month
        if (day <=0 || day > daysPerMonth[month])
            throw new IllegalArgumentException("Days (" + day +") must be 1-31");
        
        // verifique no ano bissexto se o mês é 2 e o dia é 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
                year % 4 == 0 || year % 100 != 0))
            throw new IllegalArgumentException("Day ("+ day +
                    ") out-of-range for the specified month and year");
                
        this.day = day;
        this.month = month;
        this.year = year;
        
        System.out.printf("Date object constructor for date %s%n", this);
    }

    //Retorna uma String no formato dia/mês/ano
    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
    
    
    
    
}
