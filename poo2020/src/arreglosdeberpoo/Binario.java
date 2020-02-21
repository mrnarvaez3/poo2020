package arreglosdeberpoo;
import java.util.Arrays;

public class Binario {
    // declaracion de variables
    private String numero= "";
    private int decimal = 0;
    private  int posicion = 0;

    /**
     * Metodo constructor
     * @param numero1
     */
    public Binario(String numero1){
        numero = numero1;
    }

    /**
     * Metodo parse para convertir un String a un arreglo de enteros
     * @return nums[]
     */
    public int[] parse(){
        int[] arreglo = new int[numero.length()];
        for(int i=0; i<numero.length(); i++){
            arreglo[i] = Character.getNumericValue(numero.charAt(i));
        }
        return arreglo;
    }

    /**
     * Metodo para obtener numero decimal a partir de un binario
     * @return
     */
    public int calcularDecimal(){
        for (int i = parse().length-1; i >=0 ; i--) {
            double mult = Math.pow(2,posicion);
            decimal += parse()[i] * mult;
            posicion++;
        }
        return decimal;
    }

}