package taller1;

public class Animal {
    // definicion de atributos globales

    private String tipo, nombre, especie, region, sexo, tipo_reproduccion;
    private int peso;

    // Obtencion de datos
    /**
     * Metodo para obtener el tipo del animal
     * @return this.tipo
     */
    public String obtener_tipo(){ return tipo; }
    /**
     * Metodo para obtener el nombre del animal
     * @return this.nombre
     */
    public String obtener_nombre(){ return nombre; }
    /**
     * Metodo para obtener el especie del animal
     * @return this.especie
     */
    public String obtener_especie(){ return especie; }
    /**
     * Metodo para obtener el region del animal
     * @return this.region
     */
    public String obtener_region(){ return region; }
    /**
     * Metodo para obtener el sexo del animal
     * @return this.sexo
     */
    public String obtener_sexo(){ return sexo; }


    // Actualizacion de datos
    /**
     * Metodo para actualizar el valor de la variable tipo
     */
    //  Con el this hacemos referencia a variables globales
    public void actualizar_tipo(String tipo){
        this.tipo = tipo;
    }
    /**
     * Metodo para actualizar el valor de la variable nombre
     */
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Metodo para actualizar el valor de la variable especie
     */
    public void actualizar_especie(String especie){
        this.especie = especie;
    }
    /**
     * Metodo para actualizar el valor de la variable region
     */
    public void actualizar_region(String region){
        this.region = region;
    }
    /**
     * Metodo para actualizar el valor de la variable sexo
     */
    public void actualizar_sexo(String sexo){
        this.sexo = sexo;
    }


    public String obtener_animal(){
        String cadena = String.format("Nombre: %s\n6Especie: %s" +
                        "\nRegion: %s\nSexo: %s\nTipo: %s"
                ,nombre, especie, region,sexo, tipo);
        return cadena;
    }
}
