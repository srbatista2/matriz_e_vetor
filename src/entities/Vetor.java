package entities;

import java.util.Arrays;

public class Vetor {

    private int[] vetor;
    private int tamanho;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        vetor = new int[tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
        this.tamanho = vetor.length;
    }

    public int getElemento(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return vetor[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice fora dos limites do vetor.");
        }
    }

    public void removerElemento(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            tamanho--;
            vetor = Arrays.copyOf(vetor, tamanho);
        } else {
            throw new IndexOutOfBoundsException("Índice fora dos limites do vetor.");
        }
    }

    public void ordenarVetor() {
        Arrays.sort(vetor);
    }
}
