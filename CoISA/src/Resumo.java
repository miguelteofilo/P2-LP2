package lab2;

public class Resumo {
 ;   private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }
    public String getTema() {
        return tema;
    }
    public String getConteudo() {
        return conteudo;
    }
    public boolean contemTexto(String chave) {
        if (chave == null || chave.isEmpty()) {
            return false;
        }
        return conteudo.toLowerCase().contains(chave.toLowerCase());
    }
    public String toString() {
        return tema + ": " + conteudo;
    }
}
