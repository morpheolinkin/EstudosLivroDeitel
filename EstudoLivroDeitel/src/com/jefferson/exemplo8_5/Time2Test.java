package com.jefferson.exemplo8_5;
public class Time2Test 
{
    // exibe um objeto Time2 nos formatos de 24 horas e 12 horas
    public static void displayTime (String string, Time2 t)
    {
        System.out.printf("%s%n   %s%n   %s%n", 
                string, t.toString(), t.toUniversalString());
    }
    
    public static void main(String[] args) 
    {
        Time2 t1 = new Time2 ();
        Time2 t2 = new Time2 (2);
        Time2 t3 = new Time2 (15, 30);
        Time2 t4 = new Time2 (12, 30, 50);
        Time2 t5 = new Time2 (t4);
        
        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour specified; minute specified, default second", t3);
        displayTime("t4: Hout specified; minute specifies; second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);
        
        //Tenta inicializar t6 com valores inválidos
        try
        {
            Time2 t6 = new Time2(99, 77, 88);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
        
        
    }
}// fim da classe Time2Test
