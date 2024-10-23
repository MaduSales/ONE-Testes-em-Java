package br.com.alura.pacotes.screenmatch.calculos;
import br.com.alura.pacotes.screenmatch.modelos.Filme;
import br.com.alura.pacotes.screenmatch.modelos.Serie;

public class CalculadoraDeTempo{
  private int tempoTotal;

  // Método para calcular o tempo total de um filme
  /* public void inclui(Filme f){
    tempoTotal += f.getDuracaoEmMinutos();
  }

  public void inclui(Serie s){
    tempoTotal += s.getDuracaoEmMinutos();
  } */

  public void inclui(Titulo titulo){
    tempoTotal += titulo.getDuracaoEmMinutos();
  }


  // Getters
  public int getTempoTotal(){
    return tempoTotal;
  }

  // Setters
  public void setTempoTotal(int tempoTotal){
    this.tempoTotal = tempoTotal;
  }
}