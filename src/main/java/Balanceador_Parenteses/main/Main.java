package Balanceador_Parenteses.main;

import Balanceador_Parenteses.main.controllers.TextIOController;
import Balanceador_Parenteses.main.models.ValidadorModel;

public class Main {

    static ValidadorModel validador;

    private static boolean validaArgumentos(String[] args)
    {
        if(args.length == 1)
        {
            if(args[0].trim().contains(".") && args[0].trim().length()>1)
                return true;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        if(!validaArgumentos(args))
        {
            System.out.println("Argumentos inválidos");
            return;
        }

        String NomeArquivo = args[0];
        validador = new ValidadorModel();

        TextIOController.FetchData(NomeArquivo);

    }



}
