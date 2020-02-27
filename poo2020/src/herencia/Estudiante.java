package herencia;

public class Estudiante extends Persona {

    //  Atributos propios de esta clase
    private String carrera;

    /**
     *  Constructor para la clase Estudiante
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estadoCivil
     * @param fechaNac
     */
    public Estudiante(String carrera, String nombre, String identificacion, String estadoCivil, String fechaNac){
        this.carrera = carrera;
        this.nombre = nombre;
        this.indetificacion = identificacion;
        this.estadoCivil = estadoCivil;
        this.fechaNac = fechaNac;
    }

    public void matricular() {
        System.out.println("Metodo para matricular");;
    }
    public void aprender() {
        System.out.println("Metodo para aprender");;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void presentar(){
        System.out.println("-------------------------------");
        System.out.printf("Nombre: %s\nIdentificacion: %s\nCarrera: %s\nEstado civil: %s\nFecha nacimiento: %s"
                ,getNombre(), getIndetificacion(), getCarrera(),
                getEstadoCivil(),getFechaNac());
    }
}
