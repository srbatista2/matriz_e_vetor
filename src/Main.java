import entities.Matriz;
import entities.MatrizOperacoes;
import entities.Vetor;
import java.util.Arrays;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        Vetor vetor = null; // Variável para armazenar o objeto Vetor

        while (true) {
            String[] options = {"1", "2", "3", "4", "5", "6", "7"};
            int escolha = JOptionPane.showOptionDialog(null, "Menu:\n"
                            + "1. Criar uma matriz 3x3\n"
                            + "2. Fazer operação de adição com duas matrizes\n"
                            + "3. Fazer operação de multiplicação com duas matrizes\n"
                            + "4. Transposição de matriz\n"
                            + "5. Imprimir matriz\n"
                            + "6. Criar um vetor\n"
                            + "7. Sair\n",
                    "Escolha uma opção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (escolha + 1) {
                case 1:
                    matriz.setMatriz(MatrizOperacoes.getMatriz("a"));
                    break;
                case 2:
                    MatrizOperacoes.operacaoAdicao();
                    break;
                case 3:
                    MatrizOperacoes.operacaoMultiplicacao();
                    break;
                case 4:
                    int[][] transposta = MatrizOperacoes.transposta(matriz.getMatriz());
                    JOptionPane.showMessageDialog(null, "Matriz transposta: \n" + MatrizOperacoes.printMatriz(transposta));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Matriz: \n" + MatrizOperacoes.printMatriz(matriz.getMatriz()));
                    break;
                case 6:
                    int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor:"));
                    vetor = new Vetor(tamanhoVetor);
                    int[] elementos = new int[tamanhoVetor];
                    for (int i = 0; i < tamanhoVetor; i++) {
                        elementos[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o elemento " + (i + 1) + " do vetor:"));
                    }
                    vetor.setVetor(elementos);
                    JOptionPane.showMessageDialog(null, "Vetor: " + Arrays.toString(vetor.getVetor()));
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
