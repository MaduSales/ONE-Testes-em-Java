package br.com.alura.screenmatch.pacotes.calculos;

import br.com.alura.screenmatch.pacotes.modelos.Filme;
import br.com.alura.screenmatch.pacotes.modelos.Serie;
import br.com.alura.screenmatch.pacotes.modelos.Titulo;

public class CalculadoraDeTempo{
    private int tempoTotal;

    /*
    // Metodo para calcular o tempo total de um filme
    public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos(); //Sobrecarga de código pois usei inclui() 2 vezes
    }*/

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }


    // Getters
    public int getTempoTotal(){
        return tempoTotal;
    }
}