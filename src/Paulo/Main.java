package Paulo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//
//        // mtriz 2d
//        //Criar uma matriz 3x3 de inteiros.
//
//        int[][] matrizInt = new int[2][2];
//
//
//
//
//        matrizInt[0][0] = 1;
//        matrizInt[0][1] = 2;
//        matrizInt[1][0] = 3;
//        matrizInt[1][1] = 4;
//
//
//
//
//
//        //atribuir valores a matriz com contador
//
//        int contador = 1;
//        for (int i = 0; i < matrizInt.length; i++) {
//            for (int j = 0; j < matrizInt[i].length; j++) {
//                matrizInt[i][j] = contador ;
//                contador++;
//            }
//        }
//
//
//
//        for (int i = 0; i < matrizInt.length; i++) {
//            for (int j = 0; j < matrizInt[i].length; j++) {
//                System.out.print(matrizInt[i][j] + " ");
//            }
//            System.out.println(); // Nova linha para cada linha da matriz
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//        // matriz de float
//        float[][] matrizFloat = new float[2][2];
//
//
//        matrizFloat[0][0] = 1.2f;
//        matrizFloat[0][1] = 2.3f;
//        matrizFloat[1][0] = 3.4f;
//        matrizFloat[1][1] = 4.5f;
//
//        // printando a matriz
//        for(int i = 0; i < 2; i++) {
//            for(int j = 0; j < 2; j++) {
//                System.out.print(matrizFloat[i][j] + " ");
//            }
//            System.out.println();
//
//
//
//            //  matriz de String
//            String[][] matrizString = new String[2][2];
//
//
//            matrizString[0][0] = "q";
//            matrizString[0][1] = "w";
//            matrizString[1][0] = "e";
//            matrizString[1][1] = "r";
//
//            // Imprimindo a matriz
//            for(int i = 0; i < 2; i++) {
//                for(int j = 0; j < 2; j++) {
//                    System.out.print(matrizString[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//
//
//
//
            // matriz 2x2 de objetos
            Pessoa[][] matrizPessoa = new Pessoa[2][2];


            matrizPessoa[0][0] = new Pessoa("João", 20);
            matrizPessoa[0][1] = new Pessoa("Maria", 22);
            matrizPessoa[1][0] = new Pessoa("Carlos", 25);
            matrizPessoa[1][1] = new Pessoa("Ana", 28);

            // printando a matriz
            for(int i = 0; i < 2; i++) {
                for(int j = 0; j < 2; j++) {
                    System.out.println(matrizPessoa[i][j]);
                }
            }


//
//
//
//
//
//            //mtrizes 3d
//
//            int[][][] matriz3d = new int[3][3][3]; // cria uma matriz 2x2x2.
//
//            // preencher a matriz usando um contador
//            int contador = 1;
//            for (int i = 0; i < matriz3d.length; i++) {
//                for (int j = 0; j < matriz3d[i].length; j++) {
//                    for (int k = 0; k < matriz3d[i][j].length; k++) {
//                        matriz3d[i][j][k] = contador;
//                        contador++;
//                    }
//                }
//            }
//
//            // imprimir a matriz
//            for (int i = 0; i < matriz3d.length; i++) {
//                for (int j = 0; j < matriz3d[i].length; j++) {
//                    for (int k = 0; k < matriz3d[i][j].length; k++) {
//                        System.out.print(matriz3d[i][j][k] + " ");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//


        }
    }


//
