package lab2;
import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;
    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, 4);
    }
    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numNotas];
        this.pesos = new int[numNotas];
        Arrays.fill(this.pesos, 1);
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
        if (nota >= 1 && nota <= notas.length) {
            this.notas[nota - 1] = valorNota;
        }
    }
    public void cadastraNota(int nota, double valorNota) {
        cadastroNota(nota, valorNota);
    }
    private double calculaMedia() {
        double somaNotas = 0;
        int somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        if (somaPesos == 0) {
            return 0.0;
        }
        return somaNotas / somaPesos;
    }
    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}