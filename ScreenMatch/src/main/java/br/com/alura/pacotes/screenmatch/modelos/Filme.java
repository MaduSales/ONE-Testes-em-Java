package br.com.alura.pacotes.screenmatch.modelos;
import br.com.alura.pacotes.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
  private String diretor;

  //Getter da variável
  public String getDiretor(){
    return diretor;
  }

  //Setter da variável
  public void setDiretor(String diretor){
    this.diretor = diretor;
  }

  @Override
  public int getClassificacao(){
    return (int) pegaMedia() / 2;
  }

}