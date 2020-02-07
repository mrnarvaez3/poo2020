package taller1;

public class Vehiculo {
    // definicion de atributos globales

    private String marca, tipo, material, origen, cilindraje, combustilbe;
    private double peso, precio;
    private int capacidad;


    // Obtencion de datos
    /**
     * Metodo para obtener la marca del vehiculo
     * @return this.marca
     */
    public String obtener_marca(){ return marca; }
    /**
     * Metodo para obtener el tipo del vehiculo
     * @return this.tipo
     */
    public String obtener_tipo(){ return tipo; }
    /**
     * Metodo para obtener el material del vehiculo
     * @return this.material
     */
    public String obtener_material(){ return material; }
    /**
     * Metodo para obtener el origen del vehiculo
     * @return this.origen
     */
    public String obtener_origen(){ return origen; }
    /**
     * Metodo para obtener el peso del vehiculo
     * @return this.peso
     */
    public double obtener_peso(){ return peso; }


    // Actualizacion de datos
    /**
     * Metodo para actualizar el valor de la variable tipo
     */
    //  Con el this hacemos referencia a variables globales
    public void actualizar_tipo(String tipo){
        this.tipo = tipo;
    }
    /**
     * Metodo para actualizar el valor de la variable material
     */
    public void actualizar_material(String material){
        this.material= material;
    }
    /**
     * Metodo para actualizar el valor de la variable origen
     */
    public void actualizar_origen(String origen){
        this.origen = origen;
    }
    /**
     * Metodo para actualizar el valor de la variable peso
     */
    public void actualizar_peso(double peso){
        this.peso = peso;
    }
    /**
     * Metodo para actualizar el valor de la variable cilindraje
     */
    public void actualizar_cilindraje(String cilindraje){
        this.cilindraje = cilindraje;
    }



    public String obtener_vehiculo(){
        String cadena = String.format("Material: %s\nOrigen: %s" +
                        "\nPeso: %f\nTipo: %s\nCilindraje: %s"
                ,material, origen, peso,tipo, cilindraje);
        return cadena;
    }
}
