package lab2;

public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getTema() {
        return this.tema;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public boolean contemTexto(String chave) {
        return this.conteudo.toLowerCase().contains(chave.toLowerCase());
    }

    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}