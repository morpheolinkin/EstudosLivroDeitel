package com.jefferson.exemplos8_10;

import java.util.EnumSet;

public class EnumTest 
{
    public static void main (String[] args)
    {
        System.out.println("All books");
        
        // imprime todas as strings em enum Book
        for (MetodosEnum book : MetodosEnum.values()) 
        {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), 
                    book.getCopyrightYear());
        }
        
        System.out.printf("%nDisplay a range of enum constants:%n");
        
        //imprime os primeiros 4 enuns
        for (MetodosEnum book : EnumSet.range(MetodosEnum.JHTP, MetodosEnum.CPPHTP)) 
        {
            System.out.printf("%-10s%-45s%s%n", book,//Espaçamento de da primeira string para a sengunda 
                    book.getTitle(), book.getCopyrightYear());
        }
    }
        
}
