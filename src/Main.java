import entities.Matriz;
import entities.MatrizOperacoes;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Matriz matriz = new Matriz();

        while(true) {
            String[] options = {"1", "2", "3", "4", "5", "6"};
            int escolha = JOptionPane.showOptionDialog(null, "Menu:\n"
                            + "1. Criar uma matriz 3x3\n"
                            + "2. Fazer operação de adição com duas matrizes\n"
                            + "3. Fazer operação de multiplicação com duas matrizes\n"
                            + "4. Transposição de matriz\n"
                            + "5. Imprimir matriz\n"
                            + "6. Sair\n",
                    "Escolha uma opção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (escolha+1) {
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
                    JOptionPane.showMessageDialog(null, "entities.Matriz transposta: \n" + MatrizOperacoes.printMatriz(transposta));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "entities.Matriz: \n" + MatrizOperacoes.printMatriz(matriz.getMatriz()));
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
