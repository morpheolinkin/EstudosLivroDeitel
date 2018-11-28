package com.jefferson.exemplos15_2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter file or directory name:");
        
        //cria o objeto Path com base na entrada de usuário
        Path path = Paths.get(input.nextLine());
        
        if (Files.exists(path))//Se o caminho existe, gera uma saída das informações sobre ele
        {
            
        }
    }
    
    
}
