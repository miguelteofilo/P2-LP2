package lab2;
import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.pesos = new int[4];
        for (int i = 0; i < 4; i++) {
            this.pesos[i] = 1;
        }
    }

    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.pesos = new int[numNotas];
        for (int i = 0; i < numNotas; i++) {
            this.pesos[i] = 1;
        }
    }

    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.pesos = pesos;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastroNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= this.notas.length) {
            this.notas[nota - 1] = valorNota;
        }
    }

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

    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}