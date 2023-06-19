package entities;

import javax.swing.*;

public class MatrizOperacoes {

    public static int[][] getMatriz(String ordem) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String inputValue = JOptionPane.showInputDialog("Insira o elemento na posição (" + (i+1) + "," + (j+1) + ") da " + ordem + " matriz");
                matriz[i][j] = Integer.parseInt(inputValue);
            }
        }
        return matriz;
    }

    public static void operacaoAdicao() {
        int[][] matriz1 = getMatriz("primeira");
        int[][] matriz2 = getMatriz("segunda");
        int[][] result = addMatrizes(matriz1, matriz2);
        JOptionPane.showMessageDialog(null, "Resultado da adição: \n" + printMatriz(result));
    }

    public static void operacaoMultiplicacao() {
        int[][] matriz1 = getMatriz("primeira");
        int[][] matriz2 = getMatriz("segunda");
        int[][] resultMul = multiplyMatrizes(matriz1, matriz2);
        JOptionPane.showMessageDialog(null, "Resultado da multiplicação: \n" + printMatriz(resultMul));
    }

    private static int[][] addMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposta(int[][] matriz) {
        int[][] transposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }

    public static String printMatriz(int[][] matriz) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                result.append(matriz[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
