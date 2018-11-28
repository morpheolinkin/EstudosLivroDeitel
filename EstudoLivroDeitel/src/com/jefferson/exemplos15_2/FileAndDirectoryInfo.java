package com.jefferson.capitulo15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file of directory name:");

        //Cria o objeto Path com base na entrada de usuário
        Path path = Paths.get(input.nextLine());

        if (Files.exists(path))//Se o caminho existe, gera uma saída das informações sobre ele
        {
            //Exibe informações sobre o arquivo (ou diretório)
            /*
             * O método Path getFileName (linha 29), que recebe o
             * nome String do arquivo ou diretório sem
             * nenhuma informação sobre o local
             */
           System.out.printf("%n%s exists%n", path.getFileName());
            System.out.printf("%s a directory%n",
                    Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("Last modified: %s%n",
                    Files.getLastModifiedTime(path));
            System.out.printf("Size %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

            if (Files.isDirectory(path))
            {
                System.out.printf("%nDirectory contents>%n");
                //Objeto para interação pelo conteúdo de um diretótio
                DirectoryStream<Path> directoryStream =
                        Files.newDirectoryStream(path);
                for (Path p: directoryStream)
                    System.out.println(p);
            }
        }
        else //Se não for arquivo ou diretório, gera saída da mensagem de erro
        {
            System.out.printf("%s does not exist%n", path);
        }
    }//Fim do main
}//Fim da classe FileAndDirectoryInfo
