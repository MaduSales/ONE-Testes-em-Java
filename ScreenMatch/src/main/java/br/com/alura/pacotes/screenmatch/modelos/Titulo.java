package br.com.alura.pacotes.screenmatch.modelos;

public class Titulo{
  private String nome;
  private int anoDeLancamento;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;
  private int duracaoEmMinutos;

  // Métodos
  public void exibeFichaTecnica(){
    System.out.println("Nome: " + nome);
    System.out.println("Foi lançado em: " + anoDeLancamento);
    System.out.println("Duração: " + duracaoEmMinutos);
  }

  public void avalia(double nota){
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  public double pegaMedia(){
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }

  // Getters (mostra e exibe informações privadas)
    public String getNome(){
    return nome;
  }

  public int getTotalDeAvaliacoes(){
    return totalDeAvaliacoes;
  }

  public boolean isIncluidoNoPlano(){
    return incluidoNoPlano;
  }

  public int getDuracaoEmMinutos(){
    return duracaoEmMinutos;
  }

  // Setters (altera e exibe informações privadas)
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setAnoDeLancamento(int anoDeLancamento){
    this.anoDeLancamento = anoDeLancamento;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos){
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano){
    this.incluidoNoPlano = incluidoNoPlano;
  }
}