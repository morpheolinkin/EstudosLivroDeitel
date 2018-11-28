package com.jefferson.exemplo8_1;

import java.util.Scanner;

public class Time1Test {
    public static void main (String[] args)
    {
        Time1 time = new Time1();
        
        time.displayTime("After time object is created", time);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a hora, minuto e segundo\n");
        
        int h = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();
        
        time.setTime(h, m, s);
        
        time.displayTime("After calling setTime", time);
        
        //Tenta definir data/hora com valores inválidos
        try
        {
            time.setTime(99, 99, 99);// todos os valores fora do intervaloÿ
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        
        //Exibe a data/hora após uma tentativa de definir valores inválidos
        time.displayTime("After calling setTime with invalid values", time);
    }
}
