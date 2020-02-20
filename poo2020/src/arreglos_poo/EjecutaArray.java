package arreglos_poo;
import java.util.Scanner;
public class EjecutaArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         int vectorA [] = new int [10];
         int vectorB [] = new int [10];
         int sumaProducto;

        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("Introduzca el valor del vector A en la posicion %d\n",i+1);
            vectorA[i] = teclado.nextInt();
            System.out.printf("Introduzca el valor del vector B en la posicion %d\n", i+1);
            vectorB[i] = teclado.nextInt();
        }

        Array array = new Array(vectorA, vectorB);

        array.presentar();
    }
}
