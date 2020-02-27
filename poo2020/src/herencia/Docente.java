package herencia;

public class Docente extends Persona{
    //  atributos propios de esta clase
    private String area;

    public Docente(String area) {
        this.area = area;
    }

    public void enseniar(){
        System.out.println("Metodo para enseniar");
    }

    public void calificar(){
        System.out.println("Metodo para calificar");
    }

    /**
     * Metodo contructor para la clase Docente
     * @param area
     * @param nombre
     * @param identificacion
     * @param estadoCivil
     * @param fechaNac
     */
    public Docente(String area, String nombre, String identificacion, String estadoCivil, String fechaNac){
        this.area = area;
        this.nombre = nombre;
        this.indetificacion = identificacion;
        this.estadoCivil = estadoCivil;
        this.fechaNac = fechaNac;
    }
    public void presentar(){
        System.out.println("-------------------------------");
        System.out.printf("Nombre: %s\nIdentificacion: %s\nArea: %s\nEstado civil: %s\nFecha nacimiento: %s"
                ,getNombre(), getIndetificacion(), getArea(),
                getEstadoCivil(),getFechaNac());
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
