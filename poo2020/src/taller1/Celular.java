package taller1;

public class Celular {
    // definicion de atributos globales

    private String marca, procesador, material, bateria;
    private double precio, peso, capacidad_gb, pulgadas, camara;
    private int ram;

    // Obtencion de datos
    /**
     * Metodo para obtener la marca del celular
     * @return this.marca
     */
    public String obtener_marca(){ return marca; }
    /**
     * Metodo para obtener la procesador del celular
     * @return this.procesador
     */
    public String obtener_procesador(){ return procesador; }
    /**
     * Metodo para obtener la marca del material
     * @return this.material
     */
    public String obtener_material(){ return material; }
    /**
     * Metodo para obtener la bateria del celular
     * @return this.bateria
     */
    public String obtener_bateria(){ return bateria; }
    /**
     * Metodo para obtener la ram del celular
     * @return this.ram
     */
    public int obtener_ram(){ return ram; }

    // Actualizacion de datos
    /**
     * Metodo para actualizar el valor de la variable marca
     */
    //  Con el this hacemos referencia a variables globales
    public void actualizar_marca(String marca){
        this.marca = marca;
    }
    /**
     * Metodo para actualizar el valor de la variable procesador
     */
    public void actualizar_procesador(String procesador){
        this.procesador = procesador;
    }
    /**
     * Metodo para actualizar el valor de la variable material
     */
    public void actualizar_material(String material){
        this.material = material;
    }
    /**
     * Metodo para actualizar el valor de la variable bateria
     */
    public void actualizar_bateria(String bateria){
        this.bateria = bateria;
    }
    /**
     * Metodo para actualizar el valor de la variable ram
     */
    public void actualizar_ram(int ram){
        this.ram = ram;
    }

    public String obtener_celular(){
        String cadena = String.format("Marca: %s\nBateria: %s" +
                        "\nMaterial: %s\nProcesador: %s\nram: %d"
                ,marca, bateria, material, procesador,ram );
        return cadena;
    }
}
