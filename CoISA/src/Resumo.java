package lab2;

public class Resumo {
    private String tema;
    private String conteudo;

    // Construtor do resumo
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    // Pega o tema
    public String getTema() {
        return this.tema;
    }

    // Pega o conteúdo
    public String getConteudo() {
        return this.conteudo;
    }

    // Verifica se o contéudo tem a palavra buscada
    public boolean contemTexto(String chave) {
        return this.conteudo.toLowerCase().contains(chave.toLowerCase());
    }

    // Formata em string
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}