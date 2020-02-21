package matriz_poo;
import java.util.Arrays;
import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        int[][] matrizA = new int [3][3];
        int[][] matrizB = new int [3][3];


        //  Solicitud y lectura de datos
        Matriz matriz = new Matriz(matrizA, matrizB);
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.printf("Ingrese el digito de a la matriz A [%d][%d]\n", i+1 ,j+1);
                matrizA[i][j] = teclado.nextInt();
                System.out.printf("Ingrese el digito de a la matriz B [%d][%d]\n", i+1 ,j+1);
                matrizB[i][j] = teclado.nextInt();
            }
        }
        //  Salida de datos
        System.out.println("Matriz A:" + matriz.presentar(matrizA));
        System.out.println("Matriz B:" + matriz.presentar(matrizB));
        System.out.println("Matriz C:" + matriz.presentar(matriz.sumaMatriz()));


    }
}
