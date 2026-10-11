package lab2;
import java.util.Arrays;

public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int limite;
    private int quantidade;
    private int proximoIndice;

    // Construtor que define o tamanho máximo do registro de resumos
    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.quantidade = 0;
        this.proximoIndice = 0;
    }

    // Adiciona ou atualiza um resumo de forma circular
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

    // Retorna todos os resumos formatados
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            resultado[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resultado;
    }

    // Imprime os temas cadastrados
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

    // Retorna a quantidade atual
    public int conta() {
        return this.quantidade;
    }

    // Verifica se já tem um tema cadastrado
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidade; i++) {
            if (this.temas[i] != null && this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }

    // Busca temas que contêm certa palavra no conteúdo
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