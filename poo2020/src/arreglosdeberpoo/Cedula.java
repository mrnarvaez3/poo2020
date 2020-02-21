package arreglosdeberpoo;
import java.util.Arrays;
public class Cedula {
    // declaracion de variables
    private String cedula;
    private int verificador;
    private int [] coef = {2,1,2,1,2,1,2,1,2};
    private int prdoucto = 0;
    private int suma = 0;

    /**
     * Metodo constructor
     * @param cedula1
     */
    public Cedula(String cedula1){
        this.cedula = cedula1;
    }
    /**
     * Metodo parse para convertir un String a un arreglo de enteros
     * @return nums[]
     */
    public int[] parse(){
        int[] arreglo = new int[cedula.length()];
        for(int i=0; i<cedula.length(); i++){
            arreglo[i] = Character.getNumericValue(cedula.charAt(i));
        }
        return arreglo;
    }

    /**
     * Metodo para obtener suma
     * @return suma
     */
    public int obtenerSuma(){
        for (int i = 0; i < 9; i++) {
            prdoucto = parse()[i] * coef[i];
            if (prdoucto >= 10){
                prdoucto = prdoucto - 9;
            }
            suma = suma + prdoucto;
        }
    return suma;
    }

    /**
     * Metodo para verificar el numero de cedula que se ingresa
     * @return cadena
     */
    public String  verificarCedula(){
        String cadena = "";
        verificador = 0;
        verificador = 10 - (obtenerSuma()%10);
        if (verificador == 10){
            verificador = 0;
        }
        if (verificador == parse()[9]){
            cadena = "El numero de cedula es correcto";
        }else{
            cadena = "Cedula incorrecta";
        }
        return cadena;
    }
}
