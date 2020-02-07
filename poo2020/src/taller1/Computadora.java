package taller1;

public class Computadora {
    // definicion de atributos globales

    private String color, marca, generacion, procesador, fecha_compra;

    private double tamanio, peso;

    // Obtencion de datos
    /**
     * Metodo para obtener el color de la computadora
     * @return this.color
     */
    public String obtener_color(){ return color; }
    /**
     * Metodo para obtener la marca de la computadora
     * @return this.marca
     */
    public String obtener_marca(){ return marca; }
    /**
     * Metodo para obtener la generacion de la computadora
     * @return this.generacion
     */
    public String obtener_generacion(){ return generacion; }
    /**
     * Metodo para obtener el procesador de la computadora
     * @return this.procesador
     */
    public String obtener_procesador(){ return procesador; }
    /**
     * Metodo para obtener el peso de la computadora
     * @return this.peso
     */
    public double obtener_peso(){ return peso; }

    // Actualizacion de datos
    /**
     * Metodo para actualizar el valor de la variable color
     */
    //  Con el this hacemos referencia a variables globales
    public void actualizar_color(String color){
        this.color = color;
    }
    /**
     * Metodo para actualizar el valor de la variable marca
     */
    public void actualizar_marca(String marca){
        this.marca = marca;
    }
    /**
     * Metodo para actualizar el valor de la variable generacion
     */
    public void actualizar_generacion(String generacion){
        this.generacion = generacion;
    }
    /**
     * Metodo para actualizar el valor de la variable procesador
     */
    public void actualizar_procesador(String procesador){
        this.procesador = procesador;
    }
    /**
     * Metodo para actualizar el valor de la variable peso
     */
    public void actualizar_peso(int peso){
        this.peso = peso;
    }



    public String obtener_computadora(){
        String cadena = String.format("Marca: %s\nColor: %s" +
                        "\nGeneracion: %s\nPeso en gm: %f\nProcesador: %s"
                ,marca, color, generacion,peso, procesador);
        return cadena;
    }
}
