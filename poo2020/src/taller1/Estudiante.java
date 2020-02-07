package taller1;

public class Estudiante {

    // definicion de atributos globales

    private String nombre;
    private String fecha_nacimiento;
    private String correo;
    private String numero_cedula;
    private String numero_celular;
    private String direccion;
    private String sexo;
    private String carrera;
    private String area;
    private String numero_materias;

    private int ciclo;
    private int edad;
    private double promedio;

    // Obtencion de datos
    /**
     * Metodo para obtener el nombre del estudiante
     * @return this.nombre
     */
    public String obtener_nombre(){ return nombre; }
    /**
     * Metodo para obtener la fecha de nacimiento del estudiante
     * @return this.fecha_nacimiento
     */
    public String obtener_fechaNacimiento(){
        return fecha_nacimiento;
    }
    /**
     * Metodo para obtener el correo del estudiante
     * @return this.correo
     */
    public String obtener_correo(){
        return correo;
    }
    /**
     * Metodo para obtener la edad del estudiante
     * @return this.edad
     */
    public int obtener_edad(){
        return edad;
    }
    /**
     * Metodo para obtener la cedula del estudiante
     * @return this.numero_cedula
     */
    public String obtener_numeroCedula(){
        return numero_cedula;
    }


    // Actualizacion de datos

    /**
     * Metodo para actualizar el valor de la variable nombre
     */
    public void actualizar_nombre(String nombre){
        //  Con el this hacemos referencia a variables globales
        this.nombre = nombre;
    }
    /**
     * Metodo para actualizar el valor de la variable fecha_nacimiento
     */
    public void actualizar_fechaNacimiento(String fecha_nacimiento){

        this.fecha_nacimiento = fecha_nacimiento;
    }
    /**
     * Metodo para actualizar el valor de la variable correo
     */
    public void actualizar_correo(String correo){

        this.correo = correo;
    }
    /**
     * Metodo para actualizar el valor de la variable edad
     */
    public void actualizar_edad(int edad){

        this.edad = edad;
    }
    /**
     * Metodo para actualizar el valor de la variable numero_cedula
     */
    public void actualizar_numero_cedula(String numero_cedula){

        this.numero_cedula = numero_cedula;
    }



    public String obtener_estudiante(){
        String cadena = String.format("Nombre: %s\nNumero cedula: %s" +
                        "\nFecha nacimiento: %s\nEdad: %d\nCorreo: %s"
                ,nombre, numero_cedula, fecha_nacimiento,edad, correo);
        return cadena;
    }
}
