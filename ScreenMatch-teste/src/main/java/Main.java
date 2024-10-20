import br.com.alura.pacotes.screenmatch.modelos.*; // Import the Filme class

public class Main {
  public static void main(String[] args) {
    
    Filme oPoderosoChefao = new Filme(); 
    oPoderosoChefao.setNome("O Poderoso Chefão");
    oPoderosoChefao.setAnoDeLancamento(1972);
    oPoderosoChefao.setDuracaoEmMinutos(152);
    oPoderosoChefao.exibeFichaTecnica();

    System.out.println(" ");

    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2003);
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
    lost.setMinutosPorEpisodio(50);
    lost.exibeFichaTecnica();
    System.out.println("Para maratonar Lost você precisa de " + lost.getDuracaoEmMinutos() + " minutos!");
    
  }
}