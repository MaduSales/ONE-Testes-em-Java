import br.com.alura.screenatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5.2);

        meuFilme.exibeFichaTecnica();
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obtemMedia());
    }
}