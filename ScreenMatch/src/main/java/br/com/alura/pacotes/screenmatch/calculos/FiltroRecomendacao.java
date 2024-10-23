package br.com.alura.pacotes.screenmatch.calculos;  

public class FiltroRecomendacao{
  private String recomendacao;

  public void filtra(Classificavel classificavel){
    if(classificavel.getClassificacao() <= 4){
      System.out.printl("Está entre os favoritos do momento");
    } else if (classificavel.getClassificacao() >= 2){
      System.out.println("Muito bem avaliados do momento");
    } else {
      System.out.println("Adicione na lista para assistir depois!");
    }
  }
}