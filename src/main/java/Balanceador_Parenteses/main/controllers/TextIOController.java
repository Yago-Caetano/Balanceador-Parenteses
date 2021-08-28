package Balanceador_Parenteses.main.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextIOController {

    public static void FetchData(String fileName)
    {
        int qt=0;
        System.out.println("Analisando memória.....");
        File file = new File(fileName);
        Scanner input = null;
        try
        {
            input = new Scanner(file);
        } catch (FileNotFoundException e)
        {
            System.out.println("Arquivo txt não encontrado");
            return;
        }
        while (input.hasNextLine())
        {
            String[] parts = input.nextLine().split("-");
            if (parts.length==6)
            {
                /*if (ConvertStringToCompromisso(parts))
                {
                    if(compAux.getId()>MaiorID)
                        MaiorID=compAux.getId();

                    compAux.PosLista=qt;
                    Compromissos.add(compAux);
                    qt++;
                    //System.out.println(Compromissos.get(Compromissos.size()-1).PrintCompromisso());
                }*/

            }
        }
        System.out.println(String.valueOf(qt) + " compromissos(s) recuperados");

    }
}
