package taller1;

public class Docente {
    // definicion de atributos globales

    private String nombre, fecha_nacimiento, correo, numero_cedula, numero_celular, direccion,
    sexo, titulo, area_trabajo;
    private int edad;

    // Obtencion de datos
    /**
     * Metodo para obtener el nombre del docente
     * @return this.nombre
     */
    public String obtener_nombre(){ return nombre; }
    /**
     * Metodo para obtener la fecha de nacimiento del docente
     * @return this.fecha_nacimiento
     */
    public String obtener_fecha_nacimiento(){ return fecha_nacimiento; }
    /**
     * Metodo para obtener el correo del docente
     * @return this.correo
     */
    public String obtener_correo(){ return correo; }
    /**
     * Metodo para obtener el numero de cedula del docente
     * @return this.numero_cedula
     */
    public String obtener_numero_cedula(){ return numero_cedula; }
    /**
     * Metodo para obtener el numero de celular del docente
     * @return this.numero_celular
     */
    public String obtener_numero_celular(){ return numero_celular; }

    // Actualizacion de datos
    /**
     * Metodo para actualizar el valor de la variable nombre
     */
    //  Con el this hacemos referencia a variables globales
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Metodo para actualizar el valor de la variable fecha_nacimiento
     */
    public void actualizar_fecha_nacimiento(String fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
    }
    /**
     * Metodo para actualizar el valor de la variable correo
     */
    public void actualizar_correo(String correo){
        this.correo = correo;
    }
    /**
     * Metodo para actualizar el valor de la variable numero_cedula
     */
    public void actualizar_numero_cedula(String numero_cedula){
        this.numero_cedula = numero_cedula;
    }
    /**
     * Metodo para actualizar el valor de la variable numero_celular
     */
    public void actualizar_numero_celular(String numero_celular){
        this.numero_celular = numero_celular;
    }


    public String obtener_docente(){
        String cadena = String.format("Nombre: %s\nNumero cedula: %s" +
                        "\nNumero celular: %s\nFecha nacimiento: %s\nCorreo: %s"
                ,nombre, numero_cedula, numero_celular,fecha_nacimiento, correo);
        return cadena;
    }
}
