import entities.Matriz;
import entities.MatrizOperacoes;
import entities.Vetor;

import java.util.Arrays;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        Vetor vetor = null; // Variável para armazenar o objeto Vetor
        int[][] matrizAnterior = null; // Variável para armazenar a matriz criada anteriormente

        while (true) {
            String[] options = {"1", "2", "3", "4", "5", "6", "7"};
            int escolha = JOptionPane.showOptionDialog(null, "Menu:\n"
                            + "1. Criar uma matriz\n"
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
                    int linhas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de linhas da matriz:"));
                    int colunas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de colunas da matriz:"));
                    matriz.setMatriz(MatrizOperacoes.getMatriz(linhas, colunas));
                    matrizAnterior = matriz.getMatriz();
                    break;
                case 2:
                    int[][] matriz1;
                    if (matrizAnterior != null) {
                        int opcao = JOptionPane.showOptionDialog(null, "Deseja utilizar a matriz criada anteriormente?", "Utilizar matriz anterior", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sim", "Não"}, "Sim");
                        if (opcao == JOptionPane.YES_OPTION) {
                            matriz1 = matrizAnterior;
                        } else {
                            int linhasAdicao = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de linhas da segunda matriz para adição:"));
                            int colunasAdicao = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de colunas da segunda matriz para adição:"));
                            matriz1 = MatrizOperacoes.getMatriz(linhasAdicao, colunasAdicao);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Crie uma matriz antes de realizar a operação de adição.");
                        continue;
                    }

                    int linhasAdicao = matriz1.length;
                    int colunasAdicao = matriz1[0].length;
                    int[][] matriz2 = MatrizOperacoes.getMatriz(linhasAdicao, colunasAdicao);
                    MatrizOperacoes.operacaoAdicao(matriz1, matriz2);
                    break;
                case 3:
                    int[][] matriz1Mul;
                    if (matrizAnterior != null) {
                        int opcao = JOptionPane.showOptionDialog(null, "Deseja utilizar a matriz criada anteriormente?", "Utilizar matriz anterior", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Sim", "Não"}, "Sim");
                        if (opcao == JOptionPane.YES_OPTION) {
                            matriz1Mul = matrizAnterior;
                        } else {
                            int linhas1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de linhas da primeira matriz para multiplicação:"));
                            int colunas1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de colunas da primeira matriz para multiplicação:"));
                            matriz1Mul = MatrizOperacoes.getMatriz(linhas1, colunas1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Crie uma matriz antes de realizar a operação de multiplicação.");
                        continue;
                    }

                    int linhasMultiplicacao = matriz1Mul[0].length;
                    int colunasMultiplicacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de colunas da segunda matriz para multiplicação:"));
                    int[][] matriz2Mul = MatrizOperacoes.getMatriz(linhasMultiplicacao, colunasMultiplicacao);
                    MatrizOperacoes.operacaoMultiplicacao(matriz1Mul, matriz2Mul);
                    break;
                case 4:
                    if (matriz.getMatriz() == null) {
                        JOptionPane.showMessageDialog(null, "Crie uma matriz antes de realizar a transposição.");
                    } else {
                        int[][] transposta = MatrizOperacoes.transposta(matriz.getMatriz());
                        JOptionPane.showMessageDialog(null, "Matriz transposta: \n" + MatrizOperacoes.printMatriz(transposta));
                    }
                    break;
                case 5:
                    if (matriz.getMatriz() == null) {
                        JOptionPane.showMessageDialog(null, "Crie uma matriz antes de imprimir.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Matriz: \n" + MatrizOperacoes.printMatriz(matriz.getMatriz()));
                    }
                    break;
                case 6:
                    int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor:"));
                    vetor = new Vetor(tamanhoVetor);
                    int[] elementos = new int[tamanhoVetor];
                    for (int i = 0; i < tamanhoVetor; i++) {
                        elementos[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o elemento " + (i + 1) + " do vetor:"));
                    }
                    vetor.setVetor(elementos);
                    JOptionPane.showMessageDialog(null, "Vetor atual: " + Arrays.toString(vetor.getVetor()));
                    String indiceString = JOptionPane.showInputDialog("Digite o índice do elemento a ser acessado:");
                    int indice = Integer.parseInt(indiceString);
                    int elemento = vetor.getElemento(indice);
                    JOptionPane.showMessageDialog(null, "Elemento no índice " + indice + ": " + elemento);
                    String indiceRemoverString = JOptionPane.showInputDialog("Digite o índice do elemento a ser removido:");
                    int indiceRemover = Integer.parseInt(indiceRemoverString);
                    vetor.removerElemento(indiceRemover);
                    JOptionPane.showMessageDialog(null, "Elemento removido com sucesso!");
                    JOptionPane.showMessageDialog(null, "Vetor após a remoção: " + Arrays.toString(vetor.getVetor()));
                    vetor.ordenarVetor();
                    JOptionPane.showMessageDialog(null, "Vetor ordenado: " + Arrays.toString(vetor.getVetor()));
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
