public class Filme{
  String nome;
  int anoDeLancamento;
  boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;
  int duracaoEmMinutos; 

  int getTotalDeAvaliacoes(){
    return totalDeAvaliacoes;
  }

  void exibeFichaTecnica(){
    System.out.println("O nome do filme é: "+ nome);
    System.out.println("O filme foi lançado em: " + anoDeLancamento);
  }

  void avalia(double nota){
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  double obtemMedia(){
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }
  
}