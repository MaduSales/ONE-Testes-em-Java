package br.com.alura.screenmatch.pacotes.modelos;

public class Filme extends Titulo {
    private String diretor;

    //Getter da variável
    public String getDiretor(){
        return diretor;
    }

    //Setter da variável
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

}