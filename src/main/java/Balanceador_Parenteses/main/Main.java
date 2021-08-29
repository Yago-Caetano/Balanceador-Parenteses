package Balanceador_Parenteses.main;

import Balanceador_Parenteses.main.controllers.TextIOController;
import Balanceador_Parenteses.main.models.ValidadorModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        return false;
    }

    private static void verificaDocumento(String Texto, ArrayList<String> Resultados)
    {
        String[] dados = Texto.split("\r\n");

        for (int i = 0; i < dados.length;i++)
        {
            if(validador.estaBalanceado(dados[i]))
                Resultados.add("OK");
            else
                Resultados.add("INVALIDO");
        }

    }

    private static void escreveArquivoSaida(String Texto, ArrayList<String> Resultados, String NomeArquivo)
    {
        String[] BufferAux = Texto.split("\r\n");
        String NomeCorrigido = NomeArquivo.substring(0,NomeArquivo.indexOf('.'));
        for(int i = 0; i<BufferAux.length;i++)
        {
            TextIOController.write(BufferAux[i] + "-" + Resultados.get(i),NomeCorrigido + "-check.txt");
        }
    }


    public static void main(String[] args) {

        if(!validaArgumentos(args))
        {
            System.out.println("Argumentos inválidos");
            return;
        }

        String NomeArquivo = args[0];

        try {
            ArrayList<String> Resultados = new ArrayList<>();

            String texto = TextIOController.FetchData(NomeArquivo);
            verificaDocumento(texto,Resultados);
            escreveArquivoSaida(texto,Resultados,NomeArquivo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
