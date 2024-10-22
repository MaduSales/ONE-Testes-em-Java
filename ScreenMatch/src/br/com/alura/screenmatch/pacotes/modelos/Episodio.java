package br.com.alura.screenmatch.pacotes.modelos;

public class Episodio {
    private int numero;
    private String nome;
    private Serie serie; //A série a qual esse episódio pertence

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
