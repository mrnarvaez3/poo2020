package arreglos_poo;

import java.util.Arrays;

public class Array {
        private int vectorA [] = new int [10];
        private int vectorB [] = new int [10];
        private int sumaProducto;


    public Array(int[] vectorA, int[] vectorB){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public int calcularProducto(){
        sumaProducto = 0;
        for (int i = 0; i < vectorA.length; i++) {
            sumaProducto = sumaProducto + (vectorB[i] * vectorA[i]);
        }
        return sumaProducto;
    }

    public void presentar(){
        System.out.println("VectorA: "+Arrays.toString(vectorA)+"\nVectorB: "
                + Arrays.toString(vectorB) + "\nSuma total: "+ calcularProducto());
    }

}
