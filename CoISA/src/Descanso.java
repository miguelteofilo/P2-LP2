package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    // Construtor inicializa zerado
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    // Guarda as horas de descanso
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    // Guarda o número de semanas
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    // Retorna o status baseado na média de descanso por semana
    public String getStatusGeral() {
        if (this.numeroSemanas == 0) {
            return "cansado";
        }

        int media = this.horasDescanso / this.numeroSemanas;

        if (media >= 26) {
            return "descansado";
        }

        return "cansado";
    }
}