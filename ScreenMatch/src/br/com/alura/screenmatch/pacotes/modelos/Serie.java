package br.com.alura.screenmatch.pacotes.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    // Getters
    public int getTemporadas(){
        return temporadas;
    }

    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    // Setters
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override // Anotação do Java para indicar que o metodo sobrescrito é o metodo pai (no caso, está em Titulo)
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

}