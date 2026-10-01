package lab2;

public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int limite;
    private int quantidade;
    private int proximoIndice;
    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.quantidade = 0;
        this.proximoIndice = 0;
    }
    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < quantidade; i++) {
            if (temas[i] != null && temas[i].equals(tema)) {
                conteudos[i] = conteudo;
                return;
            }
        }
        temas[proximoIndice] = tema;
        conteudos[proximoIndice] = conteudo;
        if (quantidade < limite) {
            quantidade++;
        }
        proximoIndice = (proximoIndice + 1) % limite;
    }
    public void adicionaResumo(String tema, String conteudo) {
        adiciona(tema, conteudo);
    }
    public String[] pegaResumos() {
        String[] resultado = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            resultado[i] = temas[i] + ": " + conteudos[i];
        }
        return resultado;
    }
    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(quantidade).append(" resumo(s) cadastrado(s)\n");
        sb.append("- ");
        for (int i = 0; i < quantidade; i++) {
            sb.append(temas[i]);
            if (i < quantidade - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }
    public int conta() {
        return quantidade;
    }
    public int contaResumos() {
        return conta();
    }
    public boolean temResumo(String tema) {
        for (int i = 0; i < quantidade; i++) {
            if (temas[i] != null && temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}