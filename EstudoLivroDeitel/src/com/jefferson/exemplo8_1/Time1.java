package com.jefferson.exemplo8_1;
public class Time1 
{
    private int hour; //0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    
    // configura um novo valor de tempo usando hora universal; lança uma
    // exceção se a hora, minuto ou segundo for inválido
    
    public void setTime(int hour, int minute, int second)
    {
        //Valida hora, minuto e segundo
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || 
                second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("Hour, minute and/or second was out of range");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    //Converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        //(por exemplo, "%02d") para exibir zeros à esquerda para um valor que não usa todas as 
        //posições de caracteres na largura especificada de campo.
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }
    
    //Converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12)? 12 : hour%12),//Valor entre 1 e 11 
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
    
    //Exibe um objeto Time1 nos formatos de 24 horas e 12 horas
    protected void displayTime (String string, Time1 t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", 
                string, t.toUniversalString(), t.toString());
    }
} //Fim da classe Time1
