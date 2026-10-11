package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnlineGasto;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
        this.tempoOnlineGasto = 0;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineGasto = 0;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineGasto += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnlineGasto >= this.tempoOnlineEsperado) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineGasto + "/" + this.tempoOnlineEsperado;
    }
}