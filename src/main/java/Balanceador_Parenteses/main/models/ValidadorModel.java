package Balanceador_Parenteses.main.models;

import java.util.Stack;

public class ValidadorModel {



    public ValidadorModel(){


    }

    private static boolean verificaFechamento(Character lido, Character dadoPilha)
    {
        boolean Valido = false;
        switch (dadoPilha)
        {
            case '{':
                if(lido == '}')
                    Valido = true;
                else
                    Valido = false;
                break;

            case '[':
                if(lido == ']')
                    Valido = true;
                else
                    Valido = false;
                break;

            case '(':
                if(lido == ')')
                    Valido = true;
                else
                    Valido = false;
                break;

            case '<':
                if(lido == '>')
                    Valido = true;
                else
                    Valido = false;
                break;
        }
        return Valido;
    }

    public static boolean estaBalanceado(String texto)
    {
        Stack Pilha = new Stack();

        for(int i=0; i < texto.length();i++)
        {
            Character c = texto.charAt(i);

            if((c == '(') ||(c == '{') || (c == '[') || (c == '<'))
            {
                Pilha.push(c);
            }
            else if((c == ')') ||(c == '}') || (c == ']') || (c == '>'))
            {
                if(Pilha.size() > 0)
                {
                    if(!verificaFechamento(c,(Character)Pilha.pop()))
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }

        }

        return true;
    }
}
