import java.util.*;

public class JogoDoBicho {
    Private String[] bichos {
        "AVESTRUZ" "ÁGUIA" "BURRO" "BORBOLETA" "CACHORRO" "CABRA" "CARNEIRO"
"CAMELO" "COBRA" "COELHO" "CAVALO" "ELEFANTE" "GALO" "GATO" "JACARÉ" "LEÃO" "MACACO" "PORCO" "PAVÃO" "PERU" "TOURO" "TIGRE" "URSO" "VEADO" "VACA"
    }
    Public String get.bicho(int numero) {
        if (numero < 1 || numero > 25) {
            return ("Número Inválido.")
        }
        return bichos[numero - 1];
    }
    public void fazAposta() {
        Random random = new Random();
        int[] aposta = new int[5];
        int qtd = 0

        while (qtd < 5) {
            int numSorteado = random.nextInt(25) + 1;
            boolean repetido = false;

        for (int i = 0; i < qtd; i++) {
            if (aposta[i] == numSorteado) {
                repetido = true;
                break;
            }
        }

        if (!repetido) {
            aposta[qtd] = numSorteado;
            qtd++;
        }
    }
    Arrays.sort(aposta);

    System.out.println(aposta[i])