public class Filme{
  String nome;
  int anoDeLancamento;
  boolean incluidoNoPlano;
  double avaliacao;
  int totalDeAvaliacoes;
  int duracaoEmMinutos; 

  void exibeFichaTecnica(){
    System.out.println("O nome do filme é: "+ nome);
    System.out.println("O filme foi lançado em: " + anoDeLancamento);
  }
  
}