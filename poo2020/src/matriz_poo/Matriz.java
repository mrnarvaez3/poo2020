package matriz_poo;

public class Matriz {
    //  Declaracion de variables
    private int[][] matrizA = new int [3][3];
    private int[][] matrizB = new int [3][3];
    private int[][] matrizC = new int [3][3];

    /**
     * Metodo constructor del objeto matriz
     * @param matrizA
     * @param matrizB
     */
    public Matriz(int[][] matrizA, int[][] matrizB){
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }

    /**
     * Metodo para obtener la suma entre dos matrices
     * @return matrizC
     */
    public int[][] sumaMatriz(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }

    /**
     * Metodo para imprimir una matriz
     * @param mat
     * @return
     */
    public String presentar(int [][] mat){
        String cadena = "";
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA.length; j++){
                cadena = String.format("%s\t%d\t", cadena, mat[i][j]);
            }
            cadena = String.format("\n%s\n", cadena);
        }
        return cadena;
    }
}
