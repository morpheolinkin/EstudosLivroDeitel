package com.jefferson.exemplos8_10;
public enum MetodosEnum 
{
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP ("Internet & World Wibe Web, How to program", "2012"),
    CPPHTP ("C++ How to program", "2014"),
    VBHPT ("Visual Basic How to program", "2014"),
    CSHARPHTP ("Visual C#, How to program", "2014");

   // campos de instância
   private final String title; // título de livro
   private final String copyrightYear; // ano dos direitos autorais

    // construtor enum
    MetodosEnum(String title, String copyrightYear) {
        
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    //Acessor para título de campo
    public String getTitle() {
        return title;
    }

    // acessor para o campo copyrightYear
    public String getCopyrightYear() {
        return copyrightYear;
    }
}
