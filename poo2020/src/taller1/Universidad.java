package taller1;

public class Universidad {
    // definicion de atributos globales

    private String carrera, estudiante, docente, administrativo, infraestructura, departamento,
    tipo, materias;


    // Obtencion de datos
    /**
     * Metodo para obtener el nombre de la carrera
     * @return this.carrera
     */
    public String obtener_carrera(){ return carrera; }
    /**
     * Metodo para obtener el nombre del estudiante
     * @return this.estudiante
     */
    public String obtener_estudiante(){ return estudiante; }
    /**
     * Metodo para obtener el nombre del docente
     * @return this.docente
     */
    public String obtener_docente(){ return docente; }
    /**
     * Metodo para obtener el nombre del administrativo
     * @return this.administrativo
     */
    public String obtener_administrativo(){ return administrativo; }
    /**
     * Metodo para obtener el nombre del departamento
     * @return this.departamento
     */
    public String obtener_departamento(){ return departamento; }


    // Actualizacion de datos
    /**
     * Metodo para actualizar el valor de la variable carrera
     */
    //  Con el this hacemos referencia a variables globales
    public void actualizar_carrera(String carrera){
        this.carrera = carrera;
    }
    /**
     * Metodo para actualizar el valor de la variable estudiante
     */
    public void actualizar_estudiante(String estudiante){

        this.estudiante = estudiante;
    }
    /**
     * Metodo para actualizar el valor de la variable docente
     */
    public void actualizar_docente(String docente){
        this.docente = docente;
    }
    /**
     * Metodo para actualizar el valor de la variable administrativo
     */
    public void actualizar_administrativo(String administrativo){
        this.administrativo = administrativo;
    }
    /**
     * Metodo para actualizar el valor de la variable departamento
     */
    public void actualizar_departamento(String departamento){
        this.departamento = departamento;
    }


    public String obtener_universidad(){
        String cadena = String.format("Nombre carrera: %s\nDepartamento: %s" +
                        "\nNombre administrativo: %s\nNombre docente: %s\nNombre estudiante: %s"
                ,carrera, departamento,administrativo, docente, estudiante);
        return cadena;
    }
}
