import br.com.alura.screenmatch.modelos.Filme;

public class Main {
  public static void main(String[] args) {
    Filme meuFilme = new Filme(); 
    meuFilme.nome = "Top Gun";
    meuFilme.anoDeLancamento = 1986;

    meuFilme.exibeFichaTecnica();

    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);

    //System.out.println(meuFilme.somaDasAvaliacoes);
    System.out.println(meuFilme.getTotalDeAvaliacoes());
    System.out.println(meuFilme.obtemMedia() );

  }
}