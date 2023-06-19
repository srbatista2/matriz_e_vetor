package entities;

import javax.swing.*;

public class MatrizOperacoes {

    public static int[][] getMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                boolean entradaValida = false;
                while (!entradaValida) {
                    String valorInput = JOptionPane.showInputDialog("Insira o elemento na posição (" + (i + 1) + "," + (j + 1) + ") da matriz");
                    try {
                        matriz[i][j] = Integer.parseInt(valorInput);
                        entradaValida = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Você digitou um valor inválido. Insira um número válido.");
                    }
                }
            }
        }
        return matriz;
    }

    public static void operacaoAdicao(int[][] matriz1, int[][] matriz2) {
        int[][] result = addMatrizes(matriz1, matriz2);
        JOptionPane.showMessageDialog(null, "Resultado da adição: \n" + printMatriz(result));
    }

    public static void operacaoMultiplicacao(int[][] matriz1, int[][] matriz2) {
        int[][] resultMul = multiplyMatrizes(matriz1, matriz2);
        JOptionPane.showMessageDialog(null, "Resultado da multiplicação: \n" + printMatriz(resultMul));
    }

    private static int[][] addMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] result = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                result[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas1 = matriz1.length;
        int colunas1 = matriz1[0].length;
        int colunas2 = matriz2[0].length;
        int[][] result = new int[linhas1][colunas2];
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int k = 0; k < colunas1; k++) {
                    result[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[colunas][linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }

    public static String printMatriz(int[][] matriz) {
        StringBuilder result = new StringBuilder();
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                result.append(matriz[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
