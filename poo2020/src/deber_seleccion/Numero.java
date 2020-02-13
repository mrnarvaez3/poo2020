package deber_seleccion;

public class Numero {
    // Declaracion de variables
    private double numA;
    private double numB;
    private double numC;
    private double numD;
    private double numMax;

    /**
     * Metodo constructor del objeto Numero
     * @param numA1
     * @param numB1
     * @param numC1
     * @param numD1
     */
    public Numero(double numA1, double numB1, double numC1, double numD1){
        this.numA = numA1;
        this.numB = numB1;
        this.numC = numC1;
        this.numD = numD1;
    }

    /**
     * metodo para obtener el mayoy numero
     * @return numMax
     */
    public double calcularMayor(){
        if(numA > numB && numA >numC && numA >numD){
            numMax = numA;
        } else if(numB >numC && numB >numD){
            numMax = numB;
        } else if(numC >numD){
            numMax = numC;
        } else{
            numMax = numD;
        }
        return numMax;
    }

    /**
     * metodo para obtener la salida de datos
     * @return cadena
     */
    public String presentar(){
        String cadena = String.format("El mayor numero es: %.2f",calcularMayor());
        return cadena;
    }

}
