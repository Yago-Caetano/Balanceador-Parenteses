package Balanceador_Parenteses.main.models;

public class ValidadorModel {

    private int QtdAbreParenteses;

    private int QtdFechaParenteses;

    private int QtdAbreColchete;

    private int QtdFechaColchete;

    private int QtdAbreChave;

    private int QtdFechaChave;

    private int QtdAbreMaiorQ;

    private int QtdFechaMaiorQ;

    private int QtdAbreMenorQ;

    private int QtdFechaMenorQ;

    public ValidadorModel(){
        QtdAbreParenteses = 0;
        QtdFechaParenteses = 0;
        QtdAbreColchete = 0;
        QtdFechaColchete = 0;
        QtdAbreChave = 0;
        QtdFechaChave = 0;
        QtdAbreMaiorQ = 0;
        QtdFechaMaiorQ = 0;
        QtdAbreMenorQ = 0;
        QtdFechaMenorQ = 0;
    }

    public void encontrouAbreParenteses()
    {
        QtdAbreParenteses++;
    }

    public void encontrouFechaParenteses()
    {
        QtdFechaParenteses++;
    }

    public void encontrouAbreColchete()
    {
        QtdAbreColchete++;
    }

    public void encontrouFechaColchete()
    {
        QtdFechaColchete++;
    }

    public void encontrouAbreChave()
    {
        QtdAbreChave++;
    }

    public void encontrouFechaChave()
    {
        QtdFechaChave++;
    }

    public void encontrouAbreMaiorQ()
    {
        QtdAbreMaiorQ++;
    }

    public void encontrouFechaMaiorQ()
    {
        QtdFechaMaiorQ++;
    }

    public void encontrouAbreMenorQ()
    {
        QtdAbreMenorQ++;
    }

    public void encontrouFechaMenorQ()
    {
        QtdFechaMenorQ++;
    }

    public boolean estaBalanceado()
    {
        if((QtdAbreParenteses == QtdFechaParenteses) && (QtdAbreColchete == QtdFechaColchete)
                && (QtdAbreChave == QtdFechaChave) && (QtdAbreMaiorQ == QtdFechaMaiorQ) && (QtdAbreMenorQ == QtdFechaMenorQ))
            return true;

        return false;
    }
}
