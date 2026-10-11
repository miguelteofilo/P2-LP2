package lab2;
import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;

    // Construtor padrão para 4 notas com peso 1
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.pesos = new int[4];
        for (int i = 0; i < 4; i++) {
            this.pesos[i] = 1;
        }
    }

    // Construtor para número customizado de notas (peso igual a 1)
    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.pesos = new int[numNotas];
        for (int i = 0; i < numNotas; i++) {
            this.pesos[i] = 1;
        }
    }

    // Construtor com notas e pesos personalizados
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.pesos = pesos;
    }

    // Acumula as horas de estudo
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    // Salva a nota na posição correta
    public void cadastroNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= this.notas.length) {
            this.notas[nota - 1] = valorNota;
        }
    }

    // Calcula a média ponderada das notas
    private double calculaMedia() {
        double somaNotas = 0;
        int somaPesos = 0;

        for (int i = 0; i < this.notas.length; i++) {
            somaNotas += this.notas[i] * this.pesos[i];
            somaPesos += this.pesos[i];
        }

        if (somaPesos == 0) {
            return 0.0;
        }

        return somaNotas / somaPesos;
    }

    // Verifica se o aluno foi aprovado por média
    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        }
        return false;
    }

    // Formata a saída da disciplina
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}