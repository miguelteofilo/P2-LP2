package lab2;
import java.util.Arrays;

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
        for (int i = 0; i < this.quantidade; i++) {
            if (this.temas[i] != null && this.temas[i].equals(tema)) {
                this.conteudos[i] = conteudo;
                return;
            }
        }

        this.temas[this.proximoIndice] = tema;
        this.conteudos[this.proximoIndice] = conteudo;

        if (this.quantidade < this.limite) {
            this.quantidade++;
        }

        this.proximoIndice = (this.proximoIndice + 1) % this.limite;
    }

    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            resultado[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resultado;
    }

    public String imprimeResumos() {
        String saida = "- " + this.quantidade + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0; i < this.quantidade; i++) {
            saida += this.temas[i];
            if (i < this.quantidade - 1) {
                saida += " | ";
            }
        }
        return saida;
    }

    public int conta() {
        return this.quantidade;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidade; i++) {
            if (this.temas[i] != null && this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] busca(String chaveDeBusca) {
        int contador = 0;
        for (int i = 0; i < this.quantidade; i++) {
            if (this.conteudos[i].toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                contador++;
            }
        }

        String[] resultados = new String[contador];
        int indice = 0;
        for (int i = 0; i < this.quantidade; i++) {
            if (this.conteudos[i].toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                resultados[indice] = this.temas[i];
                indice++;
            }
        }

        Arrays.sort(resultados);
        return resultados;
    }
}