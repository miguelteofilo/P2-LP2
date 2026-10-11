package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnlineGasto;

    // Construtor padrão com 120 minutos esperados
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
        this.tempoOnlineGasto = 0;
    }

    // Construtor com tempo esperado personalizado
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineGasto = 0;
    }

    // Soma o tempo gastp
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineGasto += tempo;
    }

    // Verifica se atingiu a meta
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnlineGasto >= this.tempoOnlineEsperado) {
            return true;
        }
        return false;
    }

    // Mostra o atual progresso
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineGasto + "/" + this.tempoOnlineEsperado;
    }
}